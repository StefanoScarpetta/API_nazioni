package com.demo.api_nazioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiNazioniApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiNazioniApplication.class, args);
    }
}
