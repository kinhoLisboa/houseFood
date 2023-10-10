package com.restaurante.delivery.housefood.pedidos.service;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PedidoApplicationService implements PedidoService{
    private  PedidoRepository pedidoRepository;

    @Override
    public PedidoResponse cadastra(PedidoRequest request) {
        log.info("[Inicial] PedidoApplicationService-cadastra");

        log.info("[Finaliza] PedidoApplicationService-cadastra");
        return null;
    }
}
