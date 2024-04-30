package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bebidapedida")
public class BebidaPedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebidaPedida;

    @Column
    private int quantidade;

    public BebidaPedida(){

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public long getIdBebidaPedida() {
        return idBebidaPedida;
    }

    public void setIdBebidaPedida(long idBebidaPedida) {
        this.idBebidaPedida = idBebidaPedida;
    }
}
