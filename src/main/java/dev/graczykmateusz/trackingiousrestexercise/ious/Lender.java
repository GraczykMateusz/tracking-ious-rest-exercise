package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class Lender {

    @NotBlank
    String name;
}
