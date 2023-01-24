package com.example.estudo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test02")
public class Test02Controller {

    @Value("${spring.profiles.active}")
    private String ambiente;

    @GetMapping
    public void test() {

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
