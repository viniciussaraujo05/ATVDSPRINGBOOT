package com.example.supermercado.controlador;

import com.example.supermercado.entidades.DetalheProduto;
import com.example.supermercado.servico.DetalheProdutoServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalhes-produto")
public class DetalheProdutoControlador {

    private final DetalheProdutoServico servico;

    public DetalheProdutoControlador(DetalheProdutoServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<DetalheProduto> listar() {
        return servico.buscarTodos();
    }

    @PostMapping
    public DetalheProduto salvar(@RequestBody DetalheProduto d) {
        return servico.salvar(d);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servico.deletar(id);
    }
}

