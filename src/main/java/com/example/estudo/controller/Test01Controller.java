package com.example.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.env.Environment;

@RestController
@RequestMapping("/test01")
public class Test01Controller {

    @Autowired
    private Environment environment;

    @GetMapping
    public void test() {
        String[] activeProfiles = environment.getActiveProfiles();

        String ambiente = activeProfiles[0];

        System.out.println("Este é o meu ambiente: " + ambiente);


        if (ambiente.equals("develop")) {
            System.out.println("Estou em desenvolvimento");
        }

        if (ambiente.equals("test")) {
            System.out.println("Estou rodando Test");
        }

        if (ambiente.equals("prod")) {
            System.out.println("Estou em produção");
        }

    }


}
