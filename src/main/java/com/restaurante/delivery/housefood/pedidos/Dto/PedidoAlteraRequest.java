package com.restaurante.delivery.housefood.pedidos.Dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class PedidoAlteraRequest {

    private String itens;
    private LocalDate dataHoraPedido;


}
