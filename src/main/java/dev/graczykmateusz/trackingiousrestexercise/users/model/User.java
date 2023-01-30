package dev.graczykmateusz.trackingiousrestexercise.users.model;

import dev.graczykmateusz.trackingiousrestexercise.ious.model.Money;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ious", joinColumns = @JoinColumn(name = "lender"))
    @MapKeyJoinColumn(name = "borrower")
    @Column(name = "amount")
    private Map<User, Money> ious;
}
