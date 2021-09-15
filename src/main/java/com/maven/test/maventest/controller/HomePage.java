package com.maven.test.maventest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ram")
@RestController
public class HomePage {

    @GetMapping(value = "home")
    public String getHome(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Hello Ram</h1>\n" +
                "\n" +
                "<p>This is your first html page.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";
    }
}
