package com.example.microservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableScheduling
public class MicroServices extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MicroServices.class, args);
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
        // Définit le port
        return new TomcatServletWebServerFactory(8086);  // Remplace 8086 par le port que tu souhaites
    }
}
