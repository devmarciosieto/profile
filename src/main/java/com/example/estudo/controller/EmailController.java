package com.example.estudo.controller;

import com.example.estudo.Service.MandarEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private MandarEmail mandarEmail;

    @GetMapping
    public void Test01() {
        //Ambiente de develop
        // Estou mandando email de desenvolvimento com a mensagem: Caro Cliente

        //Ambiente de test
        //Estou mandando email de teste com a mensagem: Caro Cliente

        // Ambiente de prod
        // Estou mandando email de verdade com a mensagem: Caro Cliente

        mandarEmail.emailEnviado("Caro Cliente");
    }

    @GetMapping("/calculo")
    public void Test02() {
        BigDecimal valor = mandarEmail.calcular(new BigDecimal("10.00"));

        // Ambiente de develop multiplica por 100 resultado é 1000
        // Ambiente de test multiplica por 10 resultado é 100
        // Ambiente de prod multiplica por 1 resultado é 10

        System.out.println(String.format("valor calulado é: %.0f",valor));
    }


}
