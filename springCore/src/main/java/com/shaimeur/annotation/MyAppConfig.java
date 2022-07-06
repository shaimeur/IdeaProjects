package com.shaimeur.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.shaimeur.annotation"})
public class MyAppConfig {
    public SMSService smsService(){
        return new SMSService() ;
    }
}
