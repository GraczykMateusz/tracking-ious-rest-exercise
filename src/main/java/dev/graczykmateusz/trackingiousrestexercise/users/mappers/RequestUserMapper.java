package dev.graczykmateusz.trackingiousrestexercise.users.mappers;

import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class RequestUserMapper implements Function<UserDetails, User> {

    @Override
    public User apply(UserDetails userDetails) {
        return User.builder()
                .name(userDetails.getName())
                .build();
    }
}
