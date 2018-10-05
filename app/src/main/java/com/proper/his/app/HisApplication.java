package com.proper.his.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.proper.his")
public class HisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisApplication.class, args);
    }
}
