package dev.graczykmateusz.trackingiousrestexercise.ious.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IOUDetails {

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
