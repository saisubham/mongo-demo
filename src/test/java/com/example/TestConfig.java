package com.example;

import com.example.repos.PersonRepository;
import org.mockito.Mockito;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class TestConfig {
    @Bean
    public PersonRepository personRepository() {
        return Mockito.mock(PersonRepository.class);
    }
}
