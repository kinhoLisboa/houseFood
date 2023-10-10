package com.restaurante.delivery.housefood.pedidos.Dto;

import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import lombok.Value;

import java.util.UUID;

@Value
public class PedidoResponse {

    private UUID id;

    public PedidoResponse(Pedido pedido) {
        this.id = pedido.getId();
    }
}
