package com.restaurante.delivery.housefood.pedidos.controller;

import com.restaurante.delivery.housefood.pedidos.Dto.*;
import com.restaurante.delivery.housefood.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<PedidoResponseList> listPedidos() {
        log.info("[Inicial] PedidoController-listPedidos");
        List<PedidoResponseList> list = service.lista();
        log.info("[Finaliza] PedidoController-listPedidos");
        return list;
    }

    @Override
    public PedidoDetalhadoResponse detalhar(UUID pedidoId) {
        log.info("[Inicial] PedidoController-detalhar");
        PedidoDetalhadoResponse detalhado = service.detalha(pedidoId);
        log.info("[Finaliza] PedidoController-detalhar");
        return detalhado;
    }

    @Override
    public void alterar(PedidoAlteraRequest request, UUID pedidoId) {
        log.info("[Inicial] PedidoController-alterar");
        service.atualiza(request, pedidoId);
        log.info("[Finaliza] PedidoController-alterar");

    }

    @Override
    public void excluir(UUID pedidoId) {
        log.info("[Inicial] PedidoController-excluir");
        service.apaga(pedidoId);
        log.info("[Finaliza] PedidoController-excluir");

    }
}
