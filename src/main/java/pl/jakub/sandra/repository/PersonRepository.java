package pl.jakub.sandra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakub.sandra.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
