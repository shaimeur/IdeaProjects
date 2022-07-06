package com.shaimeur.config;

import com.shaimeur.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    @Scope("prototype")
    public EmailService prototypeEmailService(){
        return new EmailService();
    }
}
