package dev.graczykmateusz.trackingiousrestexercise.ious;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOURepository extends JpaRepository<IOU, Long> {

}
