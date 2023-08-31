package com.restaurante.delivery.housefood.cliente.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
public class ApiRestController implements ApiController{

    private final ClienteService clienteService;
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[Inicial] ApiRestController-criaCliente");
        clienteService.cadastra(clienteRequest);
        log.info("[Finaliza] ApiRestController-criaCliente");
        return new ClienteResponse(clienteRequest);
    }
}
