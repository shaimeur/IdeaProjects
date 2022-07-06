package com.shaimeur.annotation;

import org.springframework.stereotype.Component;

@Component
public class SMSService {
        public void sendMessage(String recevere , String message){
            System.out.println(message + " is been sent to : " + recevere + "by text message" );
        }
}
