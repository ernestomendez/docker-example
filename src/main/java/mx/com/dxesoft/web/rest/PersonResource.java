package mx.com.dxesoft.web.rest;


import mx.com.dxesoft.Entity.Person;
import mx.com.dxesoft.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonResource {

    private PersonService personService;

    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAll() {
        List<Person> personList = personService.getAll();

        return new ResponseEntity<>(personList, HttpStatus.OK);
    }

    @GetMapping("/persons")
    public ResponseEntity<Page<Person>> getAll( Pageable pageable) {

        System.out.println("***************************************************************************************************");
        System.out.println("* pageable.getDefaultPageSize()" + pageable.getPageSize());
        System.out.println("* pageable.getPageParameter()" + pageable.getPageNumber());
        System.out.println("* pageable.getSizeParameter()" +pageable.getOffset());
        System.out.println("***************************************************************************************************");


        return ResponseEntity.ok(personService.getAll(pageable));
    }

    @GetMapping("/person/agrega")
    public ResponseEntity<String> saveAll() {

        personService.saveAll();

        return ResponseEntity.ok("Guardados");
    }
}
