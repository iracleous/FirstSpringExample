package gr.codehub.college.controller;

import gr.codehub.college.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CollegeController {

    @GetMapping
    public String getHello() {
        return "hello";
    }

    @GetMapping("person")
    public Person getPerson() {
        Person person = new Person("Dimitris","Athens");
        return person;
    }
    @GetMapping("info")
    public List<Person> getInfo() {
        List<Person> persons =  new ArrayList<>();
        Person person = new Person("Dimitris","Athens");
        persons.add(person);
        persons.add(person);
        persons.add(person);
        return persons;
    }


}
