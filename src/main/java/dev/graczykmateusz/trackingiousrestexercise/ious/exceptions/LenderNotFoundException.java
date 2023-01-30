package dev.graczykmateusz.trackingiousrestexercise.ious.exceptions;

import dev.graczykmateusz.trackingiousrestexercise.ious.model.Lender;

public class LenderNotFoundException extends RuntimeException {

    public LenderNotFoundException(Lender lender) {
        super("User with name: " + lender.getUser().getName() + " not found!");
    }
}
