package com.robotix.setAttributes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/conf.xml");
        Config conf = (Config) context.getBean("xmlConfig");

        System.out.println(conf.getState());
        System.out.println(conf.getSettings());
    }
}
