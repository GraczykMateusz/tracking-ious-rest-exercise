package dev.graczykmateusz.trackingiousrestexercise.ious.model;

import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {

    @Valid
    @NotNull
    private UserDetails user;
}
