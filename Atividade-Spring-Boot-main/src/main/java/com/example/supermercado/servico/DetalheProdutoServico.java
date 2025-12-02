package com.example.supermercado.servico;

import com.example.supermercado.entidades.DetalheProduto;
import com.example.supermercado.repositorio.DetalheProdutoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalheProdutoServico {

    private final DetalheProdutoRepositorio repo;

    public DetalheProdutoServico(DetalheProdutoRepositorio repo) {
        this.repo = repo;
    }

    public List<DetalheProduto> buscarTodos() {
        return repo.findAll();
    }

    public DetalheProduto salvar(DetalheProduto d) {
        return repo.save(d);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

