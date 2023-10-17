package com.example.controllers;

import com.example.models.Person;
import com.example.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {
        Person p = personRepository.save(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> personList = personRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(personList);
    }
}
