package dev.graczykmateusz.trackingiousrestexercise.users;

import dev.graczykmateusz.trackingiousrestexercise.users.dto.UserReadModel;
import dev.graczykmateusz.trackingiousrestexercise.users.dto.UserReadModelMapper;
import dev.graczykmateusz.trackingiousrestexercise.users.mappers.RequestUserMapper;
import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import dev.graczykmateusz.trackingiousrestexercise.users.requests.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final RequestUserMapper requestUserMapper;
    private final UserReadModelMapper userReadModelMapper;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UserReadModel createUser(CreateUserRequest request) {
        User user = requestUserMapper.apply(request.getUser());
        user = userRepository.save(user);
        return userReadModelMapper.apply(user);
    }
}
