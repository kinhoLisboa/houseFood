package com.restaurante.delivery.housefood.pedidos.controller;

import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pedido")
public interface PedidoAplication {

    @PostMapping
    PedidoResponse cria (@RequestBody PedidoRequest request);




}
