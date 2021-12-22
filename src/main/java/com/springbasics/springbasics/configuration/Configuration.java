package com.springbasics.springbasics.configuration;

import com.springbasics.springbasics.service.Studentservioce;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {
    //@beans are the method level annatations
    //Applicationcontext.getbean() method we get the bean from the container
@Bean
    public Studentservioce getstudent(){
        return new Studentservioce();
    }
}
