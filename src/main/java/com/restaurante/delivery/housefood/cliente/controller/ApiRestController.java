package com.restaurante.delivery.housefood.cliente.controller;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import com.restaurante.delivery.housefood.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
public class ApiRestController implements ApiController{

    private final ClienteService clienteService;
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[Inicial] ApiRestController-criaCliente");
        ClienteResponse clienteReponse =  clienteService.cadastra(clienteRequest);
        log.info("[Finaliza] ApiRestController-criaCliente");
        return clienteReponse;
    }
}
