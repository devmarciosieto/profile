package com.example.estudo.controller;

import com.example.estudo.model.comAnotacao.Cliente;
import com.example.estudo.model.comAnotacao.Pesquisa;
import com.example.estudo.util.ValidarClienteAnotacao;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/anotacao/pesquisa")
public class PesquisaAnotacaoController {

    @PostMapping
    public String post(@RequestBody @Valid Cliente cliente) {

        if (ValidarClienteAnotacao.validarPesquisa(cliente.getPesquisas())) {
            return "tudo certo";
        } else {
            System.out.println("tem resposta obrigatória");
        }

        return "tem resposta obrigatória";
    }

    @PostMapping("/campos")
    public List<String> postComCampos(@RequestBody @Valid Cliente cliente) {

        List<Pesquisa> pesquisas = ValidarClienteAnotacao.validarPesquisaComCamposDoError(cliente.getPesquisas());

        List<String> campos = new ArrayList<>();

        if (pesquisas.isEmpty()) {
            System.out.println("tudo certo");
            campos.add("Tudo Certo");
        } else {
            for (Pesquisa pesquisa : pesquisas) {
                System.out.println(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getNumero()));

                campos.add(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getNumero()));
            }
        }
        return campos;
    }

}
