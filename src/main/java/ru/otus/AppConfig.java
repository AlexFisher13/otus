package ru.otus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.dao.PersonDao;
import ru.otus.dao.PersonDaoSimple;
import ru.otus.service.PersonService;
import ru.otus.service.PersonServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }
    @Bean
    public PersonService personService() {
        return new PersonServiceImpl(personDao());
    }

}
