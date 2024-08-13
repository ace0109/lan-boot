package com.marvel.lan.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.marvel.lan.*"})
@MapperScan(basePackages = {"com.marvel.lan.infrastructure.persistence.mapper"})
public class LanApiStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanApiStarterApplication.class, args);
    }

}
