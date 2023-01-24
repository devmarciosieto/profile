package com.example.estudo.Service.impl;

import com.example.estudo.Service.MandarEmail;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Profile("develop")
@Service
public class MandarEmailDev implements MandarEmail {
    @Override
    public void emailEnviado(String mensagem) {
        System.out.println("Estou mandando email de desenvolvimento com a mensagem: "
        + mensagem);
    }

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("100"));
    }

}
