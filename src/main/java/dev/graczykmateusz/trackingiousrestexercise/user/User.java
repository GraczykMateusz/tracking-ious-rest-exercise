package dev.graczykmateusz.trackingiousrestexercise.user;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable {

    @EmbeddedId
    @Column(name = "name", nullable = false)
    private UserName userName;
}
