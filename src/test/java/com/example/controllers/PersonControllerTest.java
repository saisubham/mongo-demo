package com.example.controllers;

import com.example.models.Person;
import com.example.repos.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonControllerTest {
    @Mock
    private PersonRepository personRepository;
    @InjectMocks
    private PersonController personController;

    @Test
    void savePerson_success() {
        Person p = new Person("1", "john");
        when(personRepository.save(any())).thenReturn(p);
        Person actual = personController.savePerson(p).getBody();
        assertEquals(p.id(), actual.id());
    }
}
