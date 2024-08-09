package com.marvel.lan.api;

import jakarta.annotation.PostConstruct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = {"com.marvel.lan.*"})
@MapperScan(basePackages = {"com.marvel.lan.infrastructure.persistence.mapper"})
public class LanApiStarterApplication {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(LanApiStarterApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("Datasource URL: " + env.getProperty("spring.datasource.url"));
    }

}
