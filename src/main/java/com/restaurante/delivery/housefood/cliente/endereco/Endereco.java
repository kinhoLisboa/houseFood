package com.restaurante.delivery.housefood.cliente.endereco;

import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import lombok.Value;

@Value
public class Endereco {

    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;


}
