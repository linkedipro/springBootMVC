package com.mx.sura.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mx.sura")
@EnableAutoConfiguration
public class AppConfing {
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfing.class, args);
    }
}