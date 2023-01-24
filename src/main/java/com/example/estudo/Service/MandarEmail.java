package com.example.estudo.Service;

import java.math.BigDecimal;

public interface MandarEmail {
    void emailEnviado(String mensagem);

    BigDecimal calcular(BigDecimal valor);

}
