package com.restaurante.delivery.housefood.pedidos.repository;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class PedidoInfraRepository implements PedidoRepository{

    private final PedidojpaRepository repository;
    @Override
    public Pedido salva(Pedido pedido) {
        log.info("[Inicial] PedidoInfraRepository-salva");
        Pedido pedidos = repository.save(pedido);
        log.info("[Inicial] PedidoInfraRepository-salva");
        return pedidos;
    }

    @Override
    public List<Pedido> listFull() {
        log.info("[Inicial] PedidoInfraRepository-salva");
        List<Pedido> pedidos = repository.findAll();
        log.info("[Finaliza] PedidoInfraRepository-salva");
        return pedidos;
    }

    @Override
    public Pedido getIdPedido(UUID pedidoId) {
        log.info("[Inicial] PedidoInfraRepository-getIdPedido");
        Pedido pedido = repository.getReferenceById(pedidoId);
        log.info("[Finaliza] PedidoInfraRepository-getIdPedido");
        return pedido;
    }

    @Override
    public void deletar(Pedido pedido) {
        log.info("[Inicial] PedidoInfraRepository-deletar");
        repository.delete(pedido);
        log.info("[Finaliza] PedidoInfraRepository-deletar");

    }
}
