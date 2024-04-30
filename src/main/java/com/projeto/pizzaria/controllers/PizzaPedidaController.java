package com.projeto.pizzaria.controllers;

import com.projeto.pizzaria.models.PizzaPedida;
import com.projeto.pizzaria.repositories.PizzaPedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaPedidaController {

    @Autowired
    PizzaPedidaRepository pizzaPedidaRepository;

    @RequestMapping(value = "/cadastrarpizzapedida", method = RequestMethod.GET)
    public PizzaPedida save(){
        PizzaPedida p = new PizzaPedida();
        p.setQuantidade(2);
        p = this.pizzaPedidaRepository.save(p);
        return p;
    }

    @RequestMapping(value = "/mostrarpizzaspedidas", method = RequestMethod.GET)
    public List<PizzaPedida> findAll(){
        List<PizzaPedida> pizzas = this.pizzaPedidaRepository.findAll();
        return pizzas;
    }


    @RequestMapping(value = "/mostrarpizzaspedidas/{id}", method = RequestMethod.GET)
    public PizzaPedida findById(@PathVariable long id){
        Optional<PizzaPedida> resultado = this.pizzaPedidaRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Pizza não encontrada!");
        }else{
            return resultado.get();
        }
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public PizzaPedida updateById(@PathVariable long id, @RequestBody PizzaPedida pizza){
        this.findById(id);
        pizza.setIdPizzaPedida(id);
        pizza = this.pizzaPedidaRepository.save(pizza);
        return pizza;
    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public PizzaPedida deleteById(@PathVariable long id){
        PizzaPedida pizza = findById(id);
        this.pizzaPedidaRepository.deleteById(id);
        return pizza;
    }
}
