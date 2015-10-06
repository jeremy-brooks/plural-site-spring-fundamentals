package com.spring.fundamentals;

import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by jbrooks on 06/10/2015.
 */
@Configurable
@ComponentScan({"com.spring.fundamentals"})
@PropertySource("classpath:app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "customerService")
    @Scope("prototype")
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }
}
