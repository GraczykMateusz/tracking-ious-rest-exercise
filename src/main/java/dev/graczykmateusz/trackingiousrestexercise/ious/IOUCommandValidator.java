package dev.graczykmateusz.trackingiousrestexercise.ious;

import dev.graczykmateusz.trackingiousrestexercise.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IOUCommandValidator {

    private final UserService userService;

    void validate(CreateIOURequest cmd) {
        userService.checkExistence(cmd.getLender().getUserName());
        userService.checkExistence(cmd.getBorrower().getUserName());
    }
}
