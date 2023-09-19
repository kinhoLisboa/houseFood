package com.restaurante.delivery.housefood.cliente.request;

import com.restaurante.delivery.housefood.cliente.endereco.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;


import java.util.UUID;

@Value
public class ClienteRequest {

    private UUID idCliente;
    @NotBlank
    private String nome;
    @NotBlank
    @CPF
    private String cpf;
    @NotBlank
    @Email
    private String email;
    @Valid
    private Endereco endereco;
}
