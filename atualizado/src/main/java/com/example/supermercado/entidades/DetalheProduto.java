package com.example.supermercado.entidades;

import jakarta.persistence.*;

@Entity
public class DetalheProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String fabricante;

    @OneToOne
    private Produto produto;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
}
