package com.example.estudo.util.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = { VALIDADOR_PESQUISA_IMPL.class })
public @interface VALIDADOR_PESQUISA {

    String message() default "Existe Campos com tipo 2 onde o compos resposta é obrigatório";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
