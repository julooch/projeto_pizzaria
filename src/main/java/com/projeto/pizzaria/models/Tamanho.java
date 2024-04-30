package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tamanho")
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idTamanho;

    @Column
    public String nome;

    @Column
    public float desconto;

    public Tamanho(){

    }

    public long getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(long idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
