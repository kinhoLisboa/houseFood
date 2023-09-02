package com.restaurante.delivery.housefood.cliente.service;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;

public interface ClienteService {


    ClienteResponse cadastra(ClienteRequest clienteRequest);
}
