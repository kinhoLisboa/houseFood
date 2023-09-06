package com.restaurante.delivery.housefood.cliente.response;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import lombok.Value;

import java.util.UUID;
@Value
public class ClienteResponse {

    private UUID idCliente;


    public ClienteResponse(Cliente cliente) {
        this.idCliente = cliente.getId();
    }



}
