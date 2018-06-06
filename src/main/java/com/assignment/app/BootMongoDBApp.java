package com.assignment.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import java.io.IOException;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class BootMongoDBApp {
	
	@Autowired
    private Environment env;

    private static final Logger LOGGER = LoggerFactory.getLogger(BootMongoDBApp.class);

    @PostConstruct
    public void initApplication() throws IOException {
        LOGGER.info("Running with Spring profile(s) : {}", env.getActiveProfiles());
    }

	public static void main(String[] args) {
		SpringApplication.run(BootMongoDBApp.class, args);
	}
}