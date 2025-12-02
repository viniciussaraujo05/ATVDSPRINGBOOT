package com.example.supermercado.controlador;

import com.example.supermercado.entidades.Pedido;
import com.example.supermercado.servico.PedidoServico;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoControlador {

    private final PedidoServico servico;

    public PedidoControlador(PedidoServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Pedido> listar() {
        return servico.buscarTodos();
    }

    @PostMapping
    public Pedido salvar(@RequestBody Pedido o) {
        return servico.salvar(o);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servico.deletar(id);
    }
}
