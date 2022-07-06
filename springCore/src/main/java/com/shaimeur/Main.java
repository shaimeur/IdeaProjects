package com.shaimeur;

import com.shaimeur.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.security.cert.X509Certificate;

public class Main {

    public static void main(String[] args) {
        // EmailService emailService = new EmailService();

        //  BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));

        //   BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        EmailService emailService1 = context.getBean("emailService", EmailService.class);

        System.out.println("emailService1 " + emailService1);

        //ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");

        EmailService emailService2 = context.getBean("emailService", EmailService.class);

        System.out.println("emailService2 " + emailService2);

       /*
         emailService.sendEmail("haimeursaad@gmail.com","hello from haylandar");
         emailService2.sendEmail("shaimeur@gmail.com","hello from haylandar");
       */

        EmailService emailService3 = context.getBean("prototypeEmailService", EmailService.class);
        EmailService emailService4 = context.getBean("prototypeEmailService", EmailService.class);

        System.out.println(" emailService3 " + emailService3);
        System.out.println(" emailService4 " + emailService4);


        /// JAVA CONFIG

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService eService1 = context1.getBean("emailService", EmailService.class);

        System.out.println( "eService1 "+ eService1);

        EmailService eService2 = context1.getBean("emailService", EmailService.class);

        System.out.println("eService2 " + eService2);






        EmailService eService3 = context1.getBean("prototypeEmailService", EmailService.class);

        System.out.println( "eService3 "+ eService3);

        EmailService eService4 = context1.getBean("prototypeEmailService", EmailService.class);

        System.out.println("eService4 " + eService4);

        emailService1.sendEmail("test1@email.com", "hello from Appconfig");
    }
}
