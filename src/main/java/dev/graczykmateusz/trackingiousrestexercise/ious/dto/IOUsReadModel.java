package dev.graczykmateusz.trackingiousrestexercise.ious.dto;

import java.math.BigDecimal;
import java.util.Map;

public record IOUsReadModel(
        String name,
        Map<String, BigDecimal> owes,
        Map<String, BigDecimal> owed_by,
        BigDecimal balance) {
}
