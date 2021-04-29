package com.spring.core.basic.quiz;

import com.spring.core.basic.config.ComputerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void computerTest() {
        /*
            스프링 컨테이너를 통해 컴퓨터 객체를 받아서
            의존관계가 모두 자동설정되고 주입된 형태의 컴퓨터의
            info()메서드가 정상동작하도록 설정하고 테스트하세요.
         */
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ComputerConfig.class);

        Computer computer = context.getBean(Computer.class);
        computer.info();

        Computer computer2 = context.getBean(Computer.class);
        Computer computer3 = context.getBean(Computer.class);

        System.out.println("computer = " + computer);
        System.out.println("computer2 = " + computer2);
        System.out.println("computer3 = " + computer3);
    }

}