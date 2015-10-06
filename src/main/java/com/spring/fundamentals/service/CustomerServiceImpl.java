package com.spring.fundamentals.service;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepo customerRepo;

    public CustomerServiceImpl() {
        // bad practice to have multiple constructors but this works for the example!
    }

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
        System.out.println("using constructor!");
    }

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Autowired
    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
        System.out.println("using setter!");
    }
}
