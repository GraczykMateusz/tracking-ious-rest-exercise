package dev.graczykmateusz.trackingiousrestexercise.users.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails implements Serializable {

    @NotBlank
    private String name;
}
