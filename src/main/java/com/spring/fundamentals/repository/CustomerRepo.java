package com.spring.fundamentals.repository;

import com.spring.fundamentals.model.Customer;

import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */
public interface CustomerRepo {
    public List<Customer> findAll();
}
