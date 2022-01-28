package ru.otus;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.otus.domain.Person;
import ru.otus.service.PersonService;

@EnableAspectJAutoProxy //сканирует наличие компонентов помеченных @Aspect
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        PersonService service = context.getBean(PersonService.class);
        Person ivan = service.getByName("Ivan");
        System.out.println(ivan);
    }
}
