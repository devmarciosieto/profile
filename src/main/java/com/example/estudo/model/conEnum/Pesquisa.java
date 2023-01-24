package com.example.estudo.model.conEnum;

import com.example.estudo.model.Tipo;

public class Pesquisa {

    private String informacao;

    private Tipo tipo;

    private String resposta;

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
