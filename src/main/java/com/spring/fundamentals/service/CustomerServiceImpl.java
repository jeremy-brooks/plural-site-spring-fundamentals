package com.spring.fundamentals.service;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */
@Component("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
}
