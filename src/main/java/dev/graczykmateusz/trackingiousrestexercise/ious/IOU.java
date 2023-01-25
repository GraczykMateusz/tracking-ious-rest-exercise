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

    @Embedded
    @AttributeOverrides(
            @AttributeOverride(name = "userName.name", column = @Column(name = "lender", nullable = false)))
    private Lender lender;

    @Embedded
    @AttributeOverrides(
            @AttributeOverride(name = "userName.name", column = @Column(name = "borrower", nullable = false)))
    private Borrower borrower;

    @Embedded
    @AttributeOverrides(
            @AttributeOverride(name = "amount", column = @Column(name = "amount", nullable = false)))
    private Money money;
}
