package com.restaurante.delivery.housefood.pedidos.service;

import com.restaurante.delivery.housefood.pedidos.Dto.*;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import com.restaurante.delivery.housefood.pedidos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<PedidoResponseList> lista() {
        log.info("[Inicial] PedidoApplicationService-cadastra");
        List<Pedido> getList = pedidoRepository.listFull();
        log.info("[Inicial] PedidoApplicationService-cadastra");
        return PedidoResponseList.converte(getList);
    }

    @Override
    public PedidoDetalhadoResponse detalha(UUID pedidoId) {
        log.info("[Inicial] PedidoApplicationService-detalha");
        Pedido pedido = pedidoRepository.getIdPedido(pedidoId);
        log.info("[Finaliza] PedidoApplicationService-detalha");
        return new PedidoDetalhadoResponse(pedido);
    }

    @Override
    public void atualiza(PedidoAlteraRequest request, UUID pedidoId) {
        log.info("[Inicial] PedidoApplicationService-atualiza");
        Pedido pedido = pedidoRepository.getIdPedido(pedidoId);
        pedido.altera(request);
        pedidoRepository.salva(pedido);
        log.info("[Finaliza] PedidoApplicationService-atualiza");

    }

    @Override
    public void apaga(UUID pedidoId) {
        log.info("[Inicial] PedidoApplicationService-apaga");
        Pedido pedido = pedidoRepository.getIdPedido(pedidoId);
        pedidoRepository.deletar(pedido);
        log.info("[Finaliza] PedidoApplicationService-apaga");

    }
}
