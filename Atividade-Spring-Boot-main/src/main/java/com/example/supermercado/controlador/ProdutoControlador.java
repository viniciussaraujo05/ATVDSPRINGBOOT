package com.example.supermercado.controlador;

import com.example.supermercado.entidades.Produto;
import com.example.supermercado.servico.ProdutoServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoControlador {

    private final ProdutoServico servico;

    public ProdutoControlador(ProdutoServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Produto> listar() {
        return servico.buscarTodos();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto p) {
        return servico.salvar(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servico.deletar(id);
    }
}

