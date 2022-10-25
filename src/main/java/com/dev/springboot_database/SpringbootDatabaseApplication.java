package com.dev.springboot_database;

import com.dev.springboot_database.util.StringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDatabaseApplication {

    public static void main(String[] args) {
        String profile = StringUtil.nvl(System.getProperty("spring.profiles.active"), "local");
        System.setProperty("spring.profiles.active", profile);
        System.setProperty("service.name", "springboot_database");
        SpringApplication.run(SpringbootDatabaseApplication.class, args);
    }

}
