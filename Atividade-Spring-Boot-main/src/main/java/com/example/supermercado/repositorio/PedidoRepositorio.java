package com.example.supermercado.repositorio;

import com.example.supermercado.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {}
