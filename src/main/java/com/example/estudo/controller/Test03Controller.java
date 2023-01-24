package com.example.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.env.Environment;

@RestController
@RequestMapping("/test03")
public class Test03Controller {

    @Autowired
    private Environment environment;

    @GetMapping
    public void test() {


        if(environment.acceptsProfiles(Profiles.of("develop"))) {
            System.out.println("Estou em desenvolvimento");
        }

        if(environment.acceptsProfiles(Profiles.of("test"))) {
            System.out.println("Estou rodando Test");
        }

        if(environment.acceptsProfiles(Profiles.of("prod"))) {
            System.out.println("Estou em produção");
        }

    }


}
