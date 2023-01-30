package dev.graczykmateusz.trackingiousrestexercise.ious.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
