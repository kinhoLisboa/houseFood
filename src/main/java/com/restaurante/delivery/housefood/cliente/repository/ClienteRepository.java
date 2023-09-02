package com.restaurante.delivery.housefood.cliente.repository;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;

public interface ClienteRepository {


    Cliente insere(Cliente cliente);
}
