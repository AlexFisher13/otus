package ru.otus.dao;

import ru.otus.domain.Person;

public class PersonDaoSimple implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
