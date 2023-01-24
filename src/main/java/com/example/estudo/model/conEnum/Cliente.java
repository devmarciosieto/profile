package com.example.estudo.model.conEnum;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String Nome;

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
