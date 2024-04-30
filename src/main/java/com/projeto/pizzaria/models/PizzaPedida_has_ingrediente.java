package com.projeto.pizzaria.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_hasingrediente")
public class PizzaPedida_has_ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIngrediente;

    public PizzaPedida_has_ingrediente(){

    }

    public long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
}
