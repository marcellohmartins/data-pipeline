package com.application;

import com.config.DataSourceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

        DataSourceConfiguration dataSourceConfig = new DataSourceConfiguration(
                "MyDataSource",
                "jdbc:mysql://localhost:3306/mydatabase",
                "username",
                "password"
        );
    }

}