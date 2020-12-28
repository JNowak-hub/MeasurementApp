package pl.jakub.sandra.service;

import org.springframework.stereotype.Service;
import pl.jakub.sandra.model.Measurement;
import pl.jakub.sandra.model.Person;
import pl.jakub.sandra.repository.PersonRepository;

import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person){
        if(person == null){
            throw new RuntimeException("User cannot be null");
        }
        if(person.getDepartment() == null){
            throw new RuntimeException("Department cannot be null");
        }
        return personRepository.save(person);
    }

}
