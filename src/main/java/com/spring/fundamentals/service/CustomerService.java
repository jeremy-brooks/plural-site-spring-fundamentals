package com.spring.fundamentals.service;

import com.spring.fundamentals.model.Customer;

import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */
public interface CustomerService {
    public List<Customer> findAll();
}
