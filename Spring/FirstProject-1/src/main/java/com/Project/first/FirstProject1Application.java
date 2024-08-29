package com.Project.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstProject1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstProject1Application.class, args);
        Developer obj = context.getBean(Developer.class);
        obj.show();
    }
}