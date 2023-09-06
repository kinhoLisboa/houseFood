package com.restaurante.delivery.housefood.cliente.request;

import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import lombok.Value;

@Value
public class AtualizaClienteRequest {

    private String email;
    private Endereco endereco;
}
