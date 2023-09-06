package com.restaurante.delivery.housefood.cliente.repository;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Log4j2
@Repository
public class ClienteInfraRepository implements  ClienteRepository{

    private final ClienteJPARepository repository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[Inicial] ClienteInfraRepository-insere");
        repository.save(cliente);
        log.info("[Finaliza] ClienteInfraRepository-insere");
        return cliente;
    }

    @Override
    public List<Cliente> getList() {
        log.info("[Inicial] ClienteInfraRepository-buscaClientes");
        List<Cliente> list = repository.findAll();
        log.info("[Finaliza] ClienteInfraRepository-buscaClientes");
        return list;
    }

    @Override
    public Cliente getId(UUID id) {
        log.info("[Inicial] ClienteInfraRepository-getId");
        var client = repository.getReferenceById(id);
        log.info("[Finaliza] ClienteInfraRepository-getId");
        return client;
    }

    @Override
    public void delete(UUID id) {
        log.info("[Inicial] ClienteInfraRepository-delete");
        repository.deleteById(id);
        log.info("[Finaliza] ClienteInfraRepository-delete");

    }
}
