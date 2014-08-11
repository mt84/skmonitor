package com.tk.skmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    @Bean
    public ConnectionManager getConnectionManager() throws IOException {
        return new ConnectionManager();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
