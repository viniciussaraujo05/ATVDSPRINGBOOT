package com.example.supermercado.servico;

import com.example.supermercado.entidades.Produto;
import com.example.supermercado.repositorio.ProdutoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServico {

    private final ProdutoRepositorio repo;

    public ProdutoServico(ProdutoRepositorio repo) {
        this.repo = repo;
    }

    public List<Produto> buscarTodos() {
        return repo.findAll();
    }

    public Produto salvar(Produto p) {
        return repo.save(p);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
