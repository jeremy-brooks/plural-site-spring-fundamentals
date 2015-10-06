package com.spring.fundamentals.repository;

import com.spring.fundamentals.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbrooks on 05/10/2015.
 */

@Repository("customerRepo")
public class HibernateCustomerRepoImpl implements CustomerRepo {

    @Value("${firstName}")
    private String firstName;

    @Value("${lastName}")
    private String lastName;

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);

        customers.add(customer);

        return customers;
    }
}
