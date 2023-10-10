package com.restaurante.delivery.housefood.pedidos.repository;

import com.restaurante.delivery.housefood.pedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PedidojpaRepository extends JpaRepository<Pedido, UUID> {
}
