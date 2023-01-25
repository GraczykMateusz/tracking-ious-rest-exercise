package dev.graczykmateusz.trackingiousrestexercise.ious;

import dev.graczykmateusz.trackingiousrestexercise.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IOUCommandValidator {

    private final UserService userService;

    void validate(CreateIOURequest request) {
        userService.checkExistence(request.getLender().getUserName());
        userService.checkExistence(request.getBorrower().getUserName());
    }
}
