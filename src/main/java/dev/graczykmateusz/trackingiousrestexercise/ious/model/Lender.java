package dev.graczykmateusz.trackingiousrestexercise.ious.model;

import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lender {

    @Valid
    @NotNull
    private UserDetails user;
}
