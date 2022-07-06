package com.shaimeur.javaConfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Customer  {
    public Customer() {

        System.out.println("Default Constractor......**");
    }
    @PostConstruct
    public  void customInit(){

        System.out.println("custom Init****");
    }
@PreDestroy
    public void customDestroy(){
        System.out.println("custom Destroy***");
    }
}
