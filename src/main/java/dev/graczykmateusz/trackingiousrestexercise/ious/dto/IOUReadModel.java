package dev.graczykmateusz.trackingiousrestexercise.ious.dto;

import java.math.BigDecimal;
import java.util.Map;

public record IOUReadModel(String lender, Map<String, BigDecimal> borrowers) {
}
