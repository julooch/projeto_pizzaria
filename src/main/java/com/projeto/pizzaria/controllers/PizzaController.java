package com.projeto.pizzaria.controllers;

import com.projeto.pizzaria.models.Pizza;
import com.projeto.pizzaria.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    @Autowired
    PizzaRepository pizzaRepository;

    @RequestMapping(value = "/cadastrarpizza", method = RequestMethod.GET)
    public Pizza save(){
        Pizza p = new Pizza();
        p.setNomePizza("Muçarela");
        p.setPrecoBase(42.0f);
        p.setPersonalizada(false);
        p = this.pizzaRepository.save(p);
        return p;
    }

    @RequestMapping(value = "/mostrarpizzas", method = RequestMethod.GET)
    public List<Pizza> findAll(){
        List<Pizza> pizzas = this.pizzaRepository.findAll();
        return pizzas;
    }


    @RequestMapping(value = "/mostrarpizzas/{id}", method = RequestMethod.GET)
    public Pizza findById(@PathVariable long id){
        Optional<Pizza> resultado = this.pizzaRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Pizza não encontrada!");
        }else{
            return resultado.get();
        }
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Pizza updateById(@PathVariable long id, @RequestBody Pizza pizza){
        this.findById(id);
        pizza.setIdPizza(id);
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Pizza deleteById(@PathVariable long id){
        Pizza pizza = findById(id);
        this.pizzaRepository.deleteById(id);
        return pizza;
    }



}
