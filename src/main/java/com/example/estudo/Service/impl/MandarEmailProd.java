package com.example.estudo.Service.impl;

import com.example.estudo.Service.MandarEmail;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Profile("prod")
@Service
public class MandarEmailProd implements MandarEmail {
    @Override
    public void emailEnviado(String mensagem) {
        System.out.println("Estou mandando email de verdade com a mensagem: "
        + mensagem);
    }

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(BigDecimal.ONE);
    }

}
