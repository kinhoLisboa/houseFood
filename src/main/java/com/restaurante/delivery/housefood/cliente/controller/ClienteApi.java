package com.restaurante.delivery.housefood.cliente.controller;

import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteDetalhadoResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteListResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/house/cliente")
@RestController
public interface ClienteApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse cria(@RequestBody ClienteRequest clienteRequest);

    @GetMapping
    List<ClienteListResponse> list();

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    ClienteDetalhadoResponse detalhado(@PathVariable UUID id);
}
