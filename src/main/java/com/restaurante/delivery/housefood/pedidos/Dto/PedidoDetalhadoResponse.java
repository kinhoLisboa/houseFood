package com.restaurante.delivery.housefood.pedidos.Dto;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PedidoDetalhadoResponse {

    private UUID id;
    private Cliente cliente;
    private String itens;
    private LocalDate dataHoraPedido;

    public PedidoDetalhadoResponse(Pedido pedido) {
        this.id = pedido.getId();
        this.cliente = pedido.getCliente();
        this.itens = pedido.getItens();
        this.dataHoraPedido = pedido.getDataHoraPedido();
    }
}
