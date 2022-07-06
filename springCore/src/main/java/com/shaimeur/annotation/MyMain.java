package com.shaimeur.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
    public static void main(String[] args) {
     //   ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        SMSService smsService = (SMSService) context.getBean("SMSService");
        smsService.sendMessage("haimeursaad@gmail.com", "Hello from smsService ");

    }
}
