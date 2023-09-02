package com.restaurante.delivery.housefood.cliente.domain;


import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private UUID idCliente;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Cliente(ClienteRequest clienteRequest) {
        this.idCliente = clienteRequest.getIdCliente();
        this.nome = clienteRequest.getNome();
        this.cpf = clienteRequest.getCpf();
        this.email = clienteRequest.getEmail();
        this.endereco = clienteRequest.getEndereco();
}
