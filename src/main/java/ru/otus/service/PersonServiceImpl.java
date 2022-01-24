package ru.otus.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.otus.dao.PersonDao;
import ru.otus.domain.Person;

@Data
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
