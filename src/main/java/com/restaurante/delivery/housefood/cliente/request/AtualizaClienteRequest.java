package com.restaurante.delivery.housefood.cliente.request;

import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.List;

@Value
public class AtualizaClienteRequest {
    @NotBlank
    private String email;
    @Valid
    private Endereco endereco;

    private List<Pedido> pedidos;
}
