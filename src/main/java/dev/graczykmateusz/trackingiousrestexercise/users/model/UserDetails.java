package dev.graczykmateusz.trackingiousrestexercise.users.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails implements Serializable {

    @NotBlank
    private String name;
}
