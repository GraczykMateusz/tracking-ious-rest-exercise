package dev.graczykmateusz.trackingiousrestexercise.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDTOMapper userDTOMapper;
    private final UserMapper userMapper;

    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream()
                .map(userDTOMapper)
                .toList();
    }

    public List<UserDTO> createUsers(CreateUsersRequest request) {
        List<User> users = request.getUsers().stream()
                .map(userMapper)
                .toList();
        return userRepository.saveAll(users).stream()
                .map(userDTOMapper)
                .toList();
    }

    public void checkExistence(UserName userName) {
        userRepository.findByUserName(userName)
                .orElseThrow(() -> new UserNotFoundException(userName));
    }
}
