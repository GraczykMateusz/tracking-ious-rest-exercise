package dev.graczykmateusz.trackingiousrestexercise.user;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(UserName userName) {
        super("User with name: " + userName.getName() + " not found!");
    }
}
