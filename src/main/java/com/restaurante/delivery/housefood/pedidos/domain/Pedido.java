package com.restaurante.delivery.housefood.pedidos.domain;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoAlteraRequest;
import com.restaurante.delivery.housefood.pedidos.Dto.PedidoRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Cliente cliente;
    private String itens;
    private LocalDate dataHoraPedido;

    public Pedido(PedidoRequest request) {
        this.cliente = request.getCliente();
        this.itens = request.getItens();
        this.dataHoraPedido = request.getDataHoraPedido();
    }

    public void altera(PedidoAlteraRequest request) {
        this.itens = request.getItens();
        this.dataHoraPedido = request.getDataHoraPedido();
    }
}
