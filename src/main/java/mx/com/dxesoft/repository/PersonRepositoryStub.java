package mx.com.dxesoft.repository;

import mx.com.dxesoft.Entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepositoryStub {

    public List<Person> getAll() {
        List<Person> people = new ArrayList<>(6);

//        for (int i = 0; i < 9; i++) {
//            people.add(new Person("Person" +i, i +"person", "9" + i+i+i+i+i+i));
//        }

        return people;
    }
}
