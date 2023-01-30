package dev.graczykmateusz.trackingiousrestexercise.ious;

import dev.graczykmateusz.trackingiousrestexercise.ious.dto.IOUReadModel;
import dev.graczykmateusz.trackingiousrestexercise.ious.dto.IOUsReadModel;
import dev.graczykmateusz.trackingiousrestexercise.ious.exceptions.BorrowerNotFoundException;
import dev.graczykmateusz.trackingiousrestexercise.ious.exceptions.LenderNotFoundException;
import dev.graczykmateusz.trackingiousrestexercise.ious.mappers.IOUReadModelMapper;
import dev.graczykmateusz.trackingiousrestexercise.ious.model.Borrower;
import dev.graczykmateusz.trackingiousrestexercise.ious.model.Lender;
import dev.graczykmateusz.trackingiousrestexercise.ious.model.Money;
import dev.graczykmateusz.trackingiousrestexercise.ious.requests.CreateIOURequest;
import dev.graczykmateusz.trackingiousrestexercise.users.UserRepository;
import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IOUService {

    private final UserRepository userRepository;

    private final IOUReadModelMapper iouReadModelMapper;

    public IOUReadModel createIOU(CreateIOURequest request) {
        Lender lender = request.getIou().getLender();
        Borrower borrower = request.getIou().getBorrower();
        Money money = request.getIou().getMoney();

        if (haveTheSameIds(lender, borrower)) {
            throw new IllegalArgumentException("Lender and Borrower cannot have the same ids!");
        }

        User lenderUser = userRepository.findByName(lender.getUser().getName())
                .orElseThrow(() -> new LenderNotFoundException(lender));

        User borrowerUser = userRepository.findByName(borrower.getUser().getName())
                .orElseThrow(() -> new BorrowerNotFoundException(borrower));

        lenderUser.getIous().put(borrowerUser, money);

        lenderUser = userRepository.save(lenderUser);

        return iouReadModelMapper.apply(lenderUser);
    }

    public List<IOUsReadModel> getAllIOUs() {
        List<User> users = userRepository.findAll();

        List<IOUsReadModel> ious = new ArrayList<>();

        for (User user : users) {
            Map<String, BigDecimal> owes = users.stream()
                    .filter(u -> !u.getName().equals(user.getName()))
                    .filter(u -> u.getIous().containsKey(user))
                    .collect(Collectors.toMap(User::getName, v -> v.getIous().get(user).getAmount()));

            Map<String, BigDecimal> owedBy = user.getIous().entrySet().stream()
                    .collect(Collectors.toMap(
                            k -> k.getKey().getName(),
                            v -> v.getValue().getAmount()));

            BigDecimal debt = owes.values().stream()
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal income = owedBy.values().stream()
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal balance = income.subtract(debt);

            ious.add(new IOUsReadModel(user.getName(), owes, owedBy, balance));
        }
        return ious;
    }

    private boolean haveTheSameIds(Lender lender, Borrower borrower) {
        String lenderName = lender.getUser().getName();
        String borrowerName = borrower.getUser().getName();
        return lenderName.equals(borrowerName);
    }
}
