package com.example.supermercado.servico;

import com.example.supermercado.entidades.Pedido;
import com.example.supermercado.repositorio.PedidoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServico {

    private final PedidoRepositorio repo;

    public PedidoServico(PedidoRepositorio repo) {
        this.repo = repo;
    }

    public List<Pedido> buscarTodos() {
        return repo.findAll();
    }

    public Pedido salvar(Pedido o) {
        return repo.save(o);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
