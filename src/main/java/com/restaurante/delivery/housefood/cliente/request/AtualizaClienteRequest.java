package com.restaurante.delivery.housefood.cliente.request;

import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class AtualizaClienteRequest {
    @NotBlank
    private String email;
    @Valid
    private Endereco endereco;
}
