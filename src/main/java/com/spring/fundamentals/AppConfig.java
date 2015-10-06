package com.spring.fundamentals;

import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

/**
 * Created by jbrooks on 06/10/2015.
 */
@Configurable
@ComponentScan({"com.spring.fundamentals"})
public class AppConfig {

    @Bean(name = "customerService")
    @Scope("prototype")
    public CustomerService getCustomerService(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        return customerService;
    }
}
