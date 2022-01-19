package ru.otus;

import ru.otus.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.service.PersonService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        PersonService service = context.getBean(PersonService.class);
        Person ivan = service.getByName("Ivan");
        System.out.println(ivan);
    }
}
