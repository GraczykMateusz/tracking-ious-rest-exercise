package dev.graczykmateusz.trackingiousrestexercise.ious.exceptions;

import dev.graczykmateusz.trackingiousrestexercise.ious.model.Borrower;

public class BorrowerNotFoundException extends RuntimeException {

    public BorrowerNotFoundException(Borrower borrower) {
        super("User with name: " + borrower.getUser().getName() + " not found!");
    }
}
