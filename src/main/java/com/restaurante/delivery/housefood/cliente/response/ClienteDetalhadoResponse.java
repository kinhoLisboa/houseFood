package com.restaurante.delivery.housefood.cliente.response;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import jakarta.persistence.Embedded;
import lombok.Value;

import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {

    private UUID id;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.id = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.endereco= cliente.getEndereco();
    }
}
