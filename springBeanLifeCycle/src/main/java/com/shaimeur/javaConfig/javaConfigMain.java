package com.shaimeur.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class javaConfigMain {
    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
