package com.example.supermercado.servico;

import com.example.supermercado.entidades.Categoria;
import com.example.supermercado.repositorio.CategoriaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServico {

    private final CategoriaRepositorio repo;

    public CategoriaServico(CategoriaRepositorio repo) {
        this.repo = repo;
    }

    public List<Categoria> buscarTodos() {
        return repo.findAll();
    }

    public Categoria salvar(Categoria c) {
        return repo.save(c);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}

