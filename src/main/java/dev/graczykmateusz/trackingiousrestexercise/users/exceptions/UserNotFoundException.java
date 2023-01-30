package dev.graczykmateusz.trackingiousrestexercise.users.exceptions;

import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(UserDetails userDetails) {
        super("User with name: " + userDetails.getName() + " not found!");
    }
}
