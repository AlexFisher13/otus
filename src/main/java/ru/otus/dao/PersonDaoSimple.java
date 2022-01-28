package ru.otus.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.otus.configuration.properties.DataBaseProperties;
import ru.otus.domain.Person;

@Repository
@AllArgsConstructor
public class PersonDaoSimple implements PersonDao {

    private DataBaseProperties dataBaseProperties;

    @Override
    public Person findByName(String name) {
        System.out.println(dataBaseProperties);
        return new Person(name, 18);
    }
}
