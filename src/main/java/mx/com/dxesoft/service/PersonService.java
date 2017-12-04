package mx.com.dxesoft.service;


import mx.com.dxesoft.Entity.Person;
import mx.com.dxesoft.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

//    private PersonRepositoryStub personRepositoryStub;

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
//        this.personRepositoryStub = personRepositoryStub;
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Page<Person> getAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public void saveAll() {
        for (int i = 0; i < 40; i++) {
            Person person = new Person();

            person.setName("Person" + i);
            person.setLastName(i + "Person");
            person.setPhone("9" +i+i+i+i+i+i+i);

            personRepository.save(person);

        }
    }
}
