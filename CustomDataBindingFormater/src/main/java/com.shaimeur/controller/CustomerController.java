package com.shaimeur.controller;

import com.shaimeur.model.Customer;
import com.shaimeur.model.Phone;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CustomerController {

    @GetMapping("/")
    public String getCustomuerForm() {
        return "customerForm";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(Customer customer) {
        return "customerDetail";
    }

    @GetMapping("/edit")
    public String editCustomer(Model model) {
        Phone p = new Phone("123", "456", "7890");
        Customer customer = new Customer("saad", "Haimeur", p);
        model.addAttribute("customer", customer);
        return "CostumerEditForm";
    }
}
