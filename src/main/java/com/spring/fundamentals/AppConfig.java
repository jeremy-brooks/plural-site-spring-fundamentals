package com.spring.fundamentals;

import com.spring.fundamentals.repository.CustomerRepo;
import com.spring.fundamentals.repository.HibernateCustomerRepoImpl;
import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jbrooks on 06/10/2015.
 */
@Configurable
@ComponentScan({"com.spring.fundamentals"})
public class AppConfig {

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService(){
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//
//        return customerService;
//    }

//    @Bean(name = "customerRepo")
//    public CustomerRepo getCustomerRepo(){
//        return new HibernateCustomerRepoImpl();
//    }
}
