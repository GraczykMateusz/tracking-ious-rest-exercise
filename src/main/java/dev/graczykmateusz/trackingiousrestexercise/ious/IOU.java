package dev.graczykmateusz.trackingiousrestexercise.ious;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ious")
public class IOU {

    @Id
    @GeneratedValue
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
    @Column(name = "amount", nullable = false)
    private Money money;
}
