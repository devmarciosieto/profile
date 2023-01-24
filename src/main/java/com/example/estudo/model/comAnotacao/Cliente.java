package com.example.estudo.model.comAnotacao;

import com.example.estudo.util.validation.VALIDADOR_PESQUISA;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String Nome;

    @VALIDADOR_PESQUISA
    private List<Pesquisa> pesquisas = new ArrayList<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Pesquisa> getPesquisas() {
        return pesquisas;
    }

    public void setPesquisas(List<Pesquisa> pesquisas) {
        this.pesquisas = pesquisas;
    }

}
