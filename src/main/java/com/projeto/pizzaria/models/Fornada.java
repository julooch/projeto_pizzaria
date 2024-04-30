package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornada")
public class Fornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFornada;

    @Column
    private int numeroFornada;

    @Column
    private int quantidadePizzas;

    public Fornada(){

    }

    public long getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(long idFornada) {
        this.idFornada = idFornada;
    }

    public int getQuantidadePizzas() {
        return quantidadePizzas;
    }

    public void setQuantidadePizzas(int quantidadePizzas) {
        this.quantidadePizzas = quantidadePizzas;
    }

    public int getNumeroFornada() {
        return numeroFornada;
    }

    public void setNumeroFornada(int numeroFornada) {
        this.numeroFornada = numeroFornada;
    }
}
