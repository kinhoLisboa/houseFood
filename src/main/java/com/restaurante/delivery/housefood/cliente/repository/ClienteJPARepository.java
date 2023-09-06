package com.restaurante.delivery.housefood.cliente.repository;

import com.restaurante.delivery.housefood.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteJPARepository extends JpaRepository<Cliente, UUID> {
}
