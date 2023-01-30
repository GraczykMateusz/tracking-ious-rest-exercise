package dev.graczykmateusz.trackingiousrestexercise.users;

import dev.graczykmateusz.trackingiousrestexercise.users.dto.UserReadModel;
import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import dev.graczykmateusz.trackingiousrestexercise.users.requests.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
class UserController {

    private final UserService userService;

    @GetMapping
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    UserReadModel createUser(@Valid @RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }
}
