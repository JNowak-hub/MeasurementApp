package pl.jakub.sandra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakub.sandra.model.Department;
import pl.jakub.sandra.model.Person;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    public Optional<Person> findPeopleByDepartmentAndFirstName(Department department, String firstName);
}
