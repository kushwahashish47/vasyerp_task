package com.vasyerp.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  
public class TransactionAnalysisApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransactionAnalysisApplication.class, args);
    }
}
