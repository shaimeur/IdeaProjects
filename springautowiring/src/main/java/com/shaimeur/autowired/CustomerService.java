package com.shaimeur.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

   // @Autowired(required = false)
    @Autowired
    @Qualifier("customerDaoImpl2")
    private CustomerDao customerDao;

    public CustomerService() {
        System.out.println("Default Constractor");
    }

    //@Autowired
    public CustomerService(CustomerDao customerDao) {
        System.out.println(" customased constractor....");
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }
    //@Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("setter...");
        this.customerDao = customerDao;
    }
}
