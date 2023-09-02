package com.restaurante.delivery.housefood.cliente.service;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService{
    
    private final ClienteRepository clienteRepository;


    @Override
    public ClienteResponse cadastra(ClienteRequest clienteRequest) {
        
        Cliente cliente = clienteRepository.salva(clienteRequest);
        return new ClienteResponse(cliente);
    }
}
