package com.example.estudo.controller;

import com.example.estudo.model.conEnum.Pesquisa;
import com.example.estudo.util.ValidarClienteEnum;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enum/pesquisa")
public class PesquisaEnumController {

    @PostMapping
    public String post(@RequestBody List<Pesquisa> pesquisas) {

        if (ValidarClienteEnum.validarPesquisa(pesquisas)) {
            System.out.println("tudo certo");
            return "tudo certo";
        } else {
            System.out.println("tem resposta obrigatória");
        }
        return "tem resposta obrigatória";
    }

    @PostMapping("/campos")
    public List<String> postComCampos(@RequestBody List<Pesquisa> pesquisaList) {

        List<Pesquisa> pesquisas = ValidarClienteEnum.validarPesquisaComCamposDoError(pesquisaList);

        List<String> campos = new ArrayList<>();

        if (pesquisas.isEmpty()) {
            System.out.println("tudo certo");
            campos.add("Tudo Certo");
        } else {
            for (Pesquisa pesquisa : pesquisas) {
                System.out.println(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getTipo()));

                campos.add(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getTipo()));
            }
        }
        return campos;
    }

}
