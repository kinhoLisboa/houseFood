package com.restaurante.delivery.housefood.cliente.service;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.AtualizaClienteRequest;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteDetalhadoResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteListResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {


    ClienteResponse cadastra(ClienteRequest clienteRequest);

    List<ClienteListResponse> lista();

    ClienteDetalhadoResponse busca(UUID id);


    void altera(UUID id, AtualizaClienteRequest request);

    void deleta(UUID id);
}
