package com.spring.fundamentals.service;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepo;

import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public void setCustomerRepo(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
}
