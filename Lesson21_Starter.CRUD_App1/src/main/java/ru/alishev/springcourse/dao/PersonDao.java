package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private static int COUNTER = 1;
    private List<Person> people = new ArrayList<>();
    public PersonDao() {
        people.add(new Person(COUNTER++, "Dima"));
        people.add(new Person(COUNTER++, "Polina"));
        people.add(new Person(COUNTER++, "Kate"));
        people.add(new Person(COUNTER++, "Michael"));
        people.add(new Person(COUNTER++, "Nina"));
    }
    public List<Person> index() {
        return people;
    }
    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
