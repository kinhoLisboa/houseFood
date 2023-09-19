package com.restaurante.delivery.housefood.cliente.controller;

import com.restaurante.delivery.housefood.cliente.request.AtualizaClienteRequest;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteDetalhadoResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteListResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/house/cliente")
@RestController
public interface ClienteApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse cria(@Valid @RequestBody  ClienteRequest clienteRequest);

    @GetMapping
    List<ClienteListResponse> list();

    @GetMapping(value="/{id}")
    ClienteDetalhadoResponse detalhado(@PathVariable UUID id);

    @PatchMapping(value="/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void atualiza (@PathVariable UUID id,@Valid @RequestBody AtualizaClienteRequest request);

    @DeleteMapping(value="/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void exclui (@PathVariable UUID id);
}
