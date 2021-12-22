package com.springbasics.springbasics;

import com.springbasics.springbasics.service.Studentservioce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbasicsApplication.class, args);
//creating the container(context) to get the bean object
        //@bean is used to create an object for that class in spring ioc container

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        //we are creating this bean explicitly not automatically
        // whenever we reuire the bean using getbean method to crete a bean

       Studentservioce studentservioce= applicationContext.getBean(Studentservioce.class);

       System.out.println(studentservioce.getstudents());
    }

}
