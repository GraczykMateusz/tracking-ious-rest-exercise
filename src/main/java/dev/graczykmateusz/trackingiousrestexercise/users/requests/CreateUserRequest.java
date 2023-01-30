package dev.graczykmateusz.trackingiousrestexercise.users.requests;

import dev.graczykmateusz.trackingiousrestexercise.users.model.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.Valid;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    @Valid
    @NonNull
    private UserDetails user;
}
