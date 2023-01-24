package com.example.estudo.model.comNumero;

import com.example.estudo.util.validation.VALIDADOR_PESQUISA;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String Nome;

    @VALIDADOR_PESQUISA(message = "Existe Campos com tipo 2 onde o compos resposta é obrigatório")
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
