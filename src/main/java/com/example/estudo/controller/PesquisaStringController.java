package com.example.estudo.controller;

import com.example.estudo.model.comString.Cliente;
import com.example.estudo.model.comString.Pesquisa;
import com.example.estudo.util.ValidarClienteString;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/string/pesquisa")
public class PesquisaStringController {

    @PostMapping
    public String post(@RequestBody Cliente cliente) {

        if (ValidarClienteString.validarPesquisa(cliente.getPesquisas())) {
            System.out.println("tudo certo");
            return "tudo certo";
        } else {
            System.out.println("tem resposta obrigatória");
        }
        return "tem resposta obrigatória";
    }

    @PostMapping("/campos")
    public List<String> postComCampos(@RequestBody Cliente cliente) {

        List<Pesquisa> pesquisas = ValidarClienteString.validarPesquisaComCamposDoError(cliente.getPesquisas());

        List<String> campos = new ArrayList<>();

        if (pesquisas.isEmpty()) {
            System.out.println("tudo certo");
            campos.add("Tudo Certo");
        } else {
            for (Pesquisa pesquisa : pesquisas) {
                System.out.println(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getPergunta()));

                campos.add(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getPergunta()));
            }
        }
        return campos;
    }

}
