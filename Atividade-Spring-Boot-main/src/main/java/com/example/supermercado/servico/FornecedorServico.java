package com.example.supermercado.servico;

import com.example.supermercado.entidades.Fornecedor;
import com.example.supermercado.repositorio.FornecedorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorServico {

    private final FornecedorRepositorio repo;

    public FornecedorServico(FornecedorRepositorio repo) {
        this.repo = repo;
    }

    public List<Fornecedor> buscarTodos() {
        return repo.findAll();
    }

    public Fornecedor salvar(Fornecedor s) {
        return repo.save(s);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

