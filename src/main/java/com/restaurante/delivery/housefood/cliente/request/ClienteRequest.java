package com.restaurante.delivery.housefood.cliente.request;

import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import lombok.Value;

import java.util.UUID;

@Value
public class ClienteRequest {

    private UUID idCliente;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
}
