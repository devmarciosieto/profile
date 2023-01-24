package com.example.estudo.controller;

import com.example.estudo.model.Cliente;
import com.example.estudo.model.Pesquisa;
import com.example.estudo.util.ValidarCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pesquisa")
public class PesquisaController {

    @PostMapping
    public Cliente post(@RequestBody Cliente cliente) {

        if (ValidarCliente.validarPesquisa(cliente.getPesquisas())) {
            System.out.println("tudo certo");
        } else {
            System.out.println("tem resposta obrigatória");
        }

        return cliente;
    }

    @PostMapping("/campos")
    public Cliente postComCampos(@RequestBody Cliente cliente) {

        List<Pesquisa> pesquisas = ValidarCliente.validarPesquisaComCamposDoError(cliente.getPesquisas());

        if (pesquisas.isEmpty()) {
            System.out.println("tudo certo");
        } else {
            for (Pesquisa pesquisa : pesquisas) {
                System.out.println(String.format("O campo %s foi respondido %s aí a resposta é obrigatória",
                        pesquisa.getInformacao(), pesquisa.getSim()));
            }
        }

        return cliente;
    }

}
