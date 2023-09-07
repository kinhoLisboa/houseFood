package com.restaurante.delivery.housefood.cliente.controller;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.AtualizaClienteRequest;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteDetalhadoResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteListResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import com.restaurante.delivery.housefood.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Log4j2
@RestController
public class ApiRestController implements ClienteApi {

    private final ClienteService clienteService;
    @Override
    public ClienteResponse cria(ClienteRequest clienteRequest) {
        log.info("[Inicial] ApiRestController-criaCliente");
        ClienteResponse clienteReponse =  clienteService.cadastra(clienteRequest);
        log.info("[Finaliza] ApiRestController-criaCliente");
        return clienteReponse;
    }

    @Override
    public List<ClienteListResponse> list() {
        log.info("[Inicial] ApiRestController-listCliente");
        List<ClienteListResponse> getList = clienteService.lista();
        log.info("[Finaliza] ApiRestController-listCliente");
        return getList;
    }

    @Override
    public ClienteDetalhadoResponse detalhado(UUID id) {
        log.info("[Inicial] ApiRestController-detalhado");
        Cliente cliente = clienteService.busca(id);
        log.info("[Finaliza] ApiRestController-detalhado");
        return new  ClienteDetalhadoResponse(cliente);
    }

    @Override
    public void atualiza(UUID id, AtualizaClienteRequest request) {
        log.info("[Inicial] ApiRestController-atualizar");
        clienteService.altera(id, request);
        log.info("[Finaliza] ApiRestController-atualizar");
    }

    @Override
    public void exclui(UUID id) {
        log.info("[Inicial] ApiRestController-exclui");
        clienteService.deleta(id);
        log.info("[Finaliza] ApiRestController-exclui");
    }
}
