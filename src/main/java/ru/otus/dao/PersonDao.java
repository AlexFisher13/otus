package ru.otus.dao;

import ru.otus.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}
