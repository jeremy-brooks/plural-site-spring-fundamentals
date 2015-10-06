package com.spring.fundamentals;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jbrooks on 06/10/2015.
 */
@Configurable
@ComponentScan({"com.spring.fundamentals"})
public class AppConfig {
}
