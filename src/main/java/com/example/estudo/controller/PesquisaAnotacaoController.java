package com.example.estudo.controller;

import com.example.estudo.model.comAnotacao.Cliente;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anotacao/pesquisa")
public class PesquisaAnotacaoController {

    @PostMapping
    public String post(@RequestBody @Valid Cliente cliente) {
        return "tudo certo";
    }

}
