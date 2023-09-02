package com.restaurante.delivery.housefood.cliente.repository;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements  ClienteRepository{

    private ClienteJPARepository repository;

    @Override
    public Cliente insere(Cliente cliente) {
        log.info("[Inicial] ClienteInfraRepository-insere");
        repository.save(cliente);
        log.info("[Inicial] ClienteInfraRepository-insere");
        return cliente;
    }
}
