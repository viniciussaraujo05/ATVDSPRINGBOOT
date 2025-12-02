package com.example.supermercado.controlador;

import com.example.supermercado.entidades.Fornecedor;
import com.example.supermercado.servico.FornecedorServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorControlador {

    private final FornecedorServico servico;

    public FornecedorControlador(FornecedorServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Fornecedor> listar() {
        return servico.buscarTodos();
    }

    @PostMapping
    public Fornecedor salvar(@RequestBody Fornecedor s) {
        return servico.salvar(s);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servico.deletar(id);
    }
}
