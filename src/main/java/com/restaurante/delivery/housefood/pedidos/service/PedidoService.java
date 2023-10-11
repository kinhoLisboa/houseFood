package com.restaurante.delivery.housefood.pedidos.service;

import com.restaurante.delivery.housefood.pedidos.Dto.*;

import java.util.List;
import java.util.UUID;

public interface PedidoService {
    PedidoResponse cadastra(PedidoRequest request);

    List<PedidoResponseList> lista();

    PedidoDetalhadoResponse detalha(UUID pedidoId);

    void atualiza(PedidoAlteraRequest request, UUID pedidoId);

    void apaga(UUID pedidoId);
}
