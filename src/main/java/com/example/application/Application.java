package com.example.application;

import com.example.application.Connector.MainController;
import com.example.application.data.entity.Users;
import com.example.application.data.entity.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.vaadin.artur.helpers.LaunchUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));

    }
        @Bean
                public CommandLineRunner test(UsersRepository repository){
            return (args) -> {

                repository.save(new Users("Dan",
                        "Javatestar",
                        "dan@webmail.nu",
                        "4564564656",
                        "Gata 123",
                        "123 45",
                        "Kalmar",
                        32133134,
                        true,
                        "temp",
                        5));

                };
        }

    }
