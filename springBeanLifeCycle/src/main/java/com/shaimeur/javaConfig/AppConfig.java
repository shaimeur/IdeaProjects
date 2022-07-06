package com.shaimeur.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.shaimeur.javaConfig")

public class AppConfig {


   /* @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public Customer customer() {
          return new Customer();
    }*/

}
