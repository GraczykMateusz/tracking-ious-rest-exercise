package dev.graczykmateusz.trackingiousrestexercise.users.requests;

import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    @Valid
    @NotNull
    private UserDetails user;
}
