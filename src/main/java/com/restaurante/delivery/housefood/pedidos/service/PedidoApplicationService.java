package com.restaurante.delivery.housefood.pedidos.service;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponse;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import com.restaurante.delivery.housefood.pedidos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService{

    private final PedidoRepository pedidoRepository;

    @Override
    public PedidoResponse cadastra(PedidoRequest request) {
        log.info("[Inicial] PedidoApplicationService-cadastra");
        Pedido pedido = pedidoRepository.salva(new Pedido(request));
        log.info("[Finaliza] PedidoApplicationService-cadastra");
        return new PedidoResponse(pedido);
    }
}
