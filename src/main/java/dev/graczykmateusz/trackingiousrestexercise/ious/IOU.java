package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ious")
public class IOU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String lender;

    @Column(nullable = false)
    private String borrower;

    @Column(nullable = false)
    private BigDecimal amount;
}
