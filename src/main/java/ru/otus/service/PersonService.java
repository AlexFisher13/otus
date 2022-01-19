package ru.otus.service;

import ru.otus.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
