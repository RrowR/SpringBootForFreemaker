package com.example.springbootforfreemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootForFreemakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootForFreemakerApplication.class, args);
    }

}
