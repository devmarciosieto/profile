package com.example.estudo.util;

import com.example.estudo.model.comBoolean.Pesquisa;

import java.util.List;
import java.util.stream.Collectors;

public class ValidarClienteBoolean {

    public static Boolean validarPesquisa(List<Pesquisa> pesquisas) {


        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getSim().equals(Boolean.FALSE) && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList()).isEmpty();

    }

    public static List<Pesquisa> validarPesquisaComCamposDoError(List<Pesquisa> pesquisas) {
        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getSim().equals(Boolean.FALSE) && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList());
    }

}
