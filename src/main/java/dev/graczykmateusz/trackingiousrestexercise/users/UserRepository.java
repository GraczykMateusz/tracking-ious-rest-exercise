package dev.graczykmateusz.trackingiousrestexercise.users;

import dev.graczykmateusz.trackingiousrestexercise.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);
}
