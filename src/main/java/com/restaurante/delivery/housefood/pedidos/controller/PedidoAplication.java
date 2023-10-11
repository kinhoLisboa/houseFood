package com.restaurante.delivery.housefood.pedidos.controller;

import com.restaurante.delivery.housefood.pedidos.Dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pedido")
public interface PedidoAplication {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PedidoResponse cria (@RequestBody PedidoRequest request);
    @GetMapping
    List<PedidoResponseList> listPedidos();
    @GetMapping("/{pedidoId}")
    PedidoDetalhadoResponse detalhar(@PathVariable UUID pedidoId);

    @PatchMapping("/{pedidoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void alterar (@RequestBody PedidoAlteraRequest request, @PathVariable UUID pedidoId);
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void excluir (@PathVariable  UUID pedidoId);





}
