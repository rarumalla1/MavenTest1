package com.maven.test.maventest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenTest1Application {

    static final Logger LOGGER = LoggerFactory.getLogger(MavenTest1Application.class);

    public static void main(String[] args) {
        LOGGER.info("Application Started");
        SpringApplication.run(MavenTest1Application.class, args);
    }

}
