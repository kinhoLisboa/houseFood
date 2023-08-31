package com.restaurante.delivery.housefood.cliente.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cliente")
@RestController
public interface ApiController {
    @PostMapping
    ClienteResponse criaCliente(@RequestBody ClienteRequest clienteRequest);
}
