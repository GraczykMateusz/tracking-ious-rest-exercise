package dev.graczykmateusz.trackingiousrestexercise.ious;

import java.math.BigDecimal;

public record IOUDTO(Long id,
                     String lender,
                     String borrower,
                     BigDecimal amount) {
}
