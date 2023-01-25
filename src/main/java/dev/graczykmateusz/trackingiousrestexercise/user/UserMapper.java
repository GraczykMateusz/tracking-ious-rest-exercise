package dev.graczykmateusz.trackingiousrestexercise.user;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserMapper implements Function<UserName, User> {

    @Override
    public User apply(UserName userName) {
        return User.builder().userName(userName).build();
    }
}
