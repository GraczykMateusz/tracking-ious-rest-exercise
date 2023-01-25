package dev.graczykmateusz.trackingiousrestexercise.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.Valid;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUsersRequest {

    @Valid
    @NonNull
    private List<UserName> users;
}
