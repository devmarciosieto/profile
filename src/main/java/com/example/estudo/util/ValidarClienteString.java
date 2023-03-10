package com.example.estudo.util;

import com.example.estudo.model.comString.Pesquisa;

import java.util.List;
import java.util.stream.Collectors;

public class ValidarClienteString {

    public static Boolean validarPesquisa(List<Pesquisa> pesquisas) {

        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getPergunta().equals("Não") && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList()).isEmpty();
    }

    public static List<Pesquisa> validarPesquisaComCamposDoError(List<Pesquisa> pesquisas) {
        return pesquisas.stream().filter(pesquisa ->
                        pesquisa.getPergunta().equals("Não") && (pesquisa.getResposta() == null || pesquisa.getResposta().isBlank()))
                .collect(Collectors.toList());
    }

}
