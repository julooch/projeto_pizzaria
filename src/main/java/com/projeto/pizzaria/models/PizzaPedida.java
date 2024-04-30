package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pizzaPedida")
public class PizzaPedida{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaPedida;

    @Column
    private int quantidade;

    public PizzaPedida() {

    }

    public long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
