package ru.otus.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component //аспект должен быть бином в контейнере
@Aspect
@Order(1) //опционально порядок выполнения аспектов (если их много)
public class LoggingAspect {

    @Before("execution(* ru.otus.dao.PersonDaoSimple.findByName(String))") //вещаем на конкретный метод
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Вызов " + joinPoint.getThis().getClass().getName()
                + "." + joinPoint.getSignature().getName());
    }

    @After("execution(* ru.otus.dao.PersonDaoSimple.*(..))") //вешаем на все методы
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("вызов завершился " + joinPoint.getThis().getClass().getName()
                + "." + joinPoint.getSignature().getName());
    }

    @Around("execution(* ru.otus.dao.PersonDaoSimple.*(..))") //обвешивает функционал вокруг выполнения метода
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around start");
        var result = joinPoint.proceed();
        System.out.println("Around finish");
        return result;
    }
    //С помощью аспектов добавляется любая сквозная функциональность: логгирование, обработка исключений, бенчмаркинг, доп функционал, транзакционность
    //Транзакционность по сути после успешного выполнения метода добавляет коммит в бд.
    //И вообще все аннотации это просто маркеры, которые ничего не делают, но ими могут воспользоваться аспекты или бин пост процессоры.
}
