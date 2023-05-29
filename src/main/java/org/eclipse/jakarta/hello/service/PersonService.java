package org.eclipse.jakarta.hello.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.jakarta.hello.dto.Person;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
public class PersonService {
    private static final List<Person> persons = new LinkedList<>();

    public Person addPerson(Person person){
        persons.add(person);
        return person;
    }

    public Person getPerson(String name, String lastname){
        return persons.stream().filter(p -> p.getName().equals(name) && p.getLastname().equals(lastname)).findFirst().orElse(new Person());
    }
}
