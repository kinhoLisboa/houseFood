package com.restaurante.delivery.housefood.pedidos.service;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponse;

public interface PedidoService {
    PedidoResponse cadastra(PedidoRequest request);
}
