package com.restaurante.delivery.housefood.cliente.controller;

public class ApiRestController implements ApiController{
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        clienteService.cadastra(clienteRequest);

        return new ClienteResponse();
    }
}
