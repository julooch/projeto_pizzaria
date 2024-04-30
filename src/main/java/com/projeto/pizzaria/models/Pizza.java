package com.projeto.pizzaria.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_pizza")
@Getter
@Setter
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizza;

    @Column
    private String nomePizza;

    @Column
    private float precoBase;

    @Column
    private boolean personalizada;

    public Pizza() {

    }

    public long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(long idPizza) {
        this.idPizza = idPizza;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }
}
