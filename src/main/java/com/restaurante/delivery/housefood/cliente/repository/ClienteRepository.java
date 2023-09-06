package com.restaurante.delivery.housefood.cliente.repository;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {


    Cliente salva(Cliente cliente);


    List<Cliente> getList();

    Cliente getId(UUID id);

    void delete(UUID id);
}
