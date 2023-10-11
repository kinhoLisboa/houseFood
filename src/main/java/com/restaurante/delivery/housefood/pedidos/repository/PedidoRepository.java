package com.restaurante.delivery.housefood.pedidos.repository;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponseList;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;

import java.util.List;
import java.util.UUID;

public interface PedidoRepository {

    Pedido salva(Pedido pedido);


    List<Pedido> listFull();

    Pedido getIdPedido(UUID pedidoId);

    void deletar(Pedido pedido);
}
