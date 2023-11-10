package com.dduckdori.ssdam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SsdamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsdamApplication.class, args);
    }

}
