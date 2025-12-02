package com.example.supermercado.repositorio;

import com.example.supermercado.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {}

