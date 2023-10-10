package com.restaurante.delivery.housefood.pedidos.Dto;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PedidoRequest {

    private UUID id;
    private String itens;
    private Cliente cliente;
    private LocalDate dataHoraPedido;

}
