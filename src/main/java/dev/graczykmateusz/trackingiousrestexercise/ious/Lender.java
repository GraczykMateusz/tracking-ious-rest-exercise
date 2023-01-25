package dev.graczykmateusz.trackingiousrestexercise.ious;

import dev.graczykmateusz.trackingiousrestexercise.user.UserName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lender {

    @NotNull
    private UserName userName;
}
