package com.robotix.constructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConstructors {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");

        Config config = context.getBean(Config.class);
        System.out.println(config);

    }
}
