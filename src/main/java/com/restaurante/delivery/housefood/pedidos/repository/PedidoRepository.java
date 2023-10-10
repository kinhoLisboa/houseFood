package com.restaurante.delivery.housefood.pedidos.repository;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;

public interface PedidoRepository {

    Pedido salva(Pedido pedido);
}
