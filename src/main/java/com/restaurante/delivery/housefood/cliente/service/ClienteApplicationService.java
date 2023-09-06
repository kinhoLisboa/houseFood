package com.restaurante.delivery.housefood.cliente.service;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.cliente.repository.ClienteRepository;
import com.restaurante.delivery.housefood.cliente.request.ClienteRequest;
import com.restaurante.delivery.housefood.cliente.response.ClienteDetalhadoResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteListResponse;
import com.restaurante.delivery.housefood.cliente.response.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Log4j2
@Service
public class ClienteApplicationService implements ClienteService{
    
    private final ClienteRepository clienteRepository;


    @Override
    public ClienteResponse cadastra(ClienteRequest clienteRequest) {
        log.info("[Inicial] ClienteApplicationService-cadastra");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[Finaliza] ClienteApplicationService-cadastra");
        return new ClienteResponse(cliente);
    }

    @Override
    public List<ClienteListResponse> lista() {
        log.info("[Inicial] ClienteApplicationService-lista");
        List<Cliente> clientes = clienteRepository.getList();
        log.info("[Finaliza] ClienteApplicationService-lista");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse busca(UUID id) {
        log.info("[Inicial] ClienteApplicationService-busca");
        Cliente cliente = clienteRepository.getId(id);
        log.info("[Finaliza] ClienteApplicationService-busca");
        return new ClienteDetalhadoResponse(cliente);
    }
}
