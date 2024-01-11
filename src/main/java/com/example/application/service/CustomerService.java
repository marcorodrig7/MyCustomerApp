package com.example.application.service;

import com.example.application.entity.Customer;
import com.example.application.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {

    private CustomerRepository repository;

    CustomerService(CustomerRepository repository) {
        Objects.requireNonNull(repository);
        this.repository = repository;
    }

    public List<Customer> getAllActiveMajorCustomers(){
        return (List<Customer>) repository.getAllActiveMajorCustomers();
    }

}
