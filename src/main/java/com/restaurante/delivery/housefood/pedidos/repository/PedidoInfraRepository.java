package com.restaurante.delivery.housefood.pedidos.repository;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
