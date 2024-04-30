package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bebida")
public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idBebida;

    @Column
    public String nome;

    @Column
    public float preco;

    public Bebida(){

    }

    public long getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(long idBebida) {
        this.idBebida = idBebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
