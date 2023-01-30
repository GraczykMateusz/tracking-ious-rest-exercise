package dev.graczykmateusz.trackingiousrestexercise.users.dto;

import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserReadModelMapper implements Function<User, UserReadModel> {

    @Override
    public UserReadModel apply(User user) {
        return new UserReadModel(user.getName());
    }
}
