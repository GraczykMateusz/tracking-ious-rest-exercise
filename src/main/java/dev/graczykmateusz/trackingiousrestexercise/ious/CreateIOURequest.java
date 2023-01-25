package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIOURequest {

    @Valid
    @NotNull
    private Lender lender;

    @Valid
    @NotNull
    private Borrower borrower;

    @Valid
    @NotNull
    private Money money;
}
