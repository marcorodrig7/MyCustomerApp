package com.example.application.repository;

import com.example.application.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query(value = "select c from customer c where age >= 18 and isActive = true order by name asc, surname asc")
    Collection<Customer> getAllActiveMajorCustomers();

}
