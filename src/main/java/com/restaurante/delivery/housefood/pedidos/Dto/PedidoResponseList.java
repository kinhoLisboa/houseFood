package com.restaurante.delivery.housefood.pedidos.Dto;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class PedidoResponseList {

    private Cliente cliente;
    private String itens;


    public static List<PedidoResponseList> converte(List<Pedido> getList) {
        return getList.stream().map(PedidoResponseList :: new).collect(Collectors.toList());
    }

    public PedidoResponseList(Pedido pedido){
        super();
        this.cliente = pedido.getCliente();
        this.itens = pedido.getItens();
    }
}
