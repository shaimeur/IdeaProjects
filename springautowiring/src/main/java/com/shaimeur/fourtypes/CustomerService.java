package com.shaimeur.fourtypes;

import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService {

    private CustomerDao customerDao ;

    public CustomerDao getCustomerDao() {

        return customerDao;
    }

    public CustomerService(CustomerDao customerDao) {
        System.out.println("Customesed Constractor***");
        this.customerDao = customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("setCustomerDao***");
        this.customerDao = customerDao;
    }

    public CustomerService() {
        System.out.println("Default Constractor***");
    }


}
