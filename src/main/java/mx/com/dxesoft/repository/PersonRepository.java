package mx.com.dxesoft.repository;

import mx.com.dxesoft.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
