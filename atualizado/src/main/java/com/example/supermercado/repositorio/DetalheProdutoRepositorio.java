package com.example.supermercado.repositorio;

import com.example.supermercado.entidades.DetalheProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalheProdutoRepositorio extends JpaRepository<DetalheProduto, Long> {}

