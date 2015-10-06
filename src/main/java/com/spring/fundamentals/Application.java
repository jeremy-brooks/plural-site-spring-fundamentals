package com.spring.fundamentals;

import com.spring.fundamentals.service.CustomerService;
import com.spring.fundamentals.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jbrooks on 05/10/2015.
 */
public class Application {
    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
        CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
        System.out.println(service);
        System.out.println(service2);
    }
}
