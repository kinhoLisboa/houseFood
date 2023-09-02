package com.restaurante.delivery.housefood.cliente.endereco;

import lombok.Value;

@Value
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
}
