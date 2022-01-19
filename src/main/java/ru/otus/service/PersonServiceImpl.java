package ru.otus.service;

import ru.otus.dao.PersonDao;
import ru.otus.domain.Person;

public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
