package com.restaurante.delivery.housefood.cliente.response;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {

    private String nome;
    private String email;


    public static List<ClienteListResponse> converte(List<Cliente> listCliente) {
        return listCliente.stream().map(ClienteListResponse:: new).collect(Collectors.toList());
    }

    public ClienteListResponse(Cliente cliente){
        super();
        this.nome= cliente.getNome();
        this.email= cliente.getEmail();
    }
}
