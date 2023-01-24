package com.example.estudo.util;

import com.example.estudo.model.comNumero.Pesquisa;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ValidarClienteNumero {

    public static Boolean validarPesquisa(List<Pesquisa> pesquisas) {


        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getNumero().equals(Integer.valueOf(2)) && (pesquisa.getResposta() == null || Objects.equals(pesquisa.getResposta().trim(), "")))
                .collect(Collectors.toList()).isEmpty();

    }

    public static List<Pesquisa> validarPesquisaComCamposDoError(List<Pesquisa> pesquisas) {
        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getNumero().equals(Integer.valueOf(2)) && (pesquisa.getResposta() == null || Objects.equals(pesquisa.getResposta().trim(), "")))
                .collect(Collectors.toList());
    }

}
