package com.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingExampApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggingExampApplication.class, args);
        System.out.println("Logging App started!!!");
    }
}
