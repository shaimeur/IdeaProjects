package com.shaimeur.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,InitializingBean {
    private String firstName ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("setFirstName.." + firstName);
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName..." + s);
    }

    public Customer(String firstName) {
        this.firstName = firstName;
        System.out.println("Customer first name constractor..." + firstName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory.." + beanFactory.isSingleton("cust"));
    }

    public Customer() {
        System.out.println("Customer no arg constractor");
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext..." + applicationContext.isPrototype("cust"));
        this.firstName = "Saad in Application Context " ;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.firstName = "Saad in afterPropertiesSet ";
    }
    @PostConstruct
    public void customInit(){
        System.out.println("customInit....");
        this.firstName = "Xing in customInit";
    }

}
