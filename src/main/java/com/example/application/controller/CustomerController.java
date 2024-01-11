package com.example.application.controller;

import com.example.application.entity.Customer;
import com.example.application.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class CustomerController {

    private CustomerService service;

    CustomerController(CustomerService service) {
        Objects.requireNonNull(service);
        this.service = service;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return service.getAllActiveMajorCustomers();
    }

}
