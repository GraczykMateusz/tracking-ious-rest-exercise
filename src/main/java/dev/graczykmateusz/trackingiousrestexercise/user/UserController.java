package dev.graczykmateusz.trackingiousrestexercise.user;

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
    List<UserDAO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    List<UserDAO> createUsers(@Valid @RequestBody CreateUsersCommand cmds) {
        return userService.createUsers(cmds);
    }
}
