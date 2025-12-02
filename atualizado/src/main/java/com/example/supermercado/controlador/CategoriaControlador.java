package com.example.supermercado.controlador;

import com.example.supermercado.entidades.Categoria;
import com.example.supermercado.servico.CategoriaServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaControlador {

    private final CategoriaServico servico;

    public CategoriaControlador(CategoriaServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Categoria> listar() {
        return servico.buscarTodos();
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria c) {
        return servico.salvar(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servico.deletar(id);
    }
}

