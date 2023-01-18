package dev.graczykmateusz.trackingiousrestexercise.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDAO> getUsers() {
        return userRepository.findAll();
    }

    public List<UserDAO> createUsers(CreateUsersCommand cmd) {
        List<UserDAO> userDAOS = cmd.getUsers().stream()
                .map(createUsers)
                .toList();
        return userRepository.saveAll(userDAOS);
    }

    private final Function<UserDTO, UserDAO> createUsers = user -> UserDAO.builder()
            .name(user.getName())
            .build();
}
