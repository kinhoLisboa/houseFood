package com.restaurante.delivery.housefood.pedidos.controller;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponse;
import com.restaurante.delivery.housefood.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAplication{

    private final PedidoService service;
    @Override
    public PedidoResponse cria(PedidoRequest request) {
        log.info("[Inicial] PedidoController-cria");
        PedidoResponse response = service.cadastra(request);
        log.info("[Finaliza] PedidoController-cria");
        return response;
    }
}
