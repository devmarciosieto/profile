package com.example.estudo.util;

import com.example.estudo.model.Tipo;
import com.example.estudo.model.conEnum.Pesquisa;

import java.util.List;
import java.util.stream.Collectors;

public class ValidarClienteEnum {

    public static Boolean validarPesquisa(List<Pesquisa> pesquisas) {


        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getTipo().equals(Tipo.NAO) && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList()).isEmpty();

    }

    public static List<Pesquisa> validarPesquisaComCamposDoError(List<Pesquisa> pesquisas) {
        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getTipo().equals(Tipo.NAO) && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList());
    }

}
