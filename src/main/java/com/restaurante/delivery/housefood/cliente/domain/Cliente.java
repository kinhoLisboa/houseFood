package com.restaurante.delivery.housefood.cliente.domain;


import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
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
}
