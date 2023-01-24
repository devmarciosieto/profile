package com.example.estudo.util.validation;

import com.example.estudo.model.comNumero.Pesquisa;
import com.example.estudo.util.ValidarClienteNumero;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class VALIDADOR_PESQUISA_IMPL implements ConstraintValidator<VALIDADOR_PESQUISA, List<Pesquisa>> {

    @Override
    public boolean isValid(List<Pesquisa> pesquisas, ConstraintValidatorContext constraintValidatorContext) {
        return ValidarClienteNumero.validarPesquisa(pesquisas);
    }
}
