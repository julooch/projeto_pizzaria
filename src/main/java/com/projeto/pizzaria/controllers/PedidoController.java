package com.projeto.pizzaria.controllers;

import com.projeto.pizzaria.models.Pedido;
import com.projeto.pizzaria.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping(value = "/cadastrarpedido", method = RequestMethod.GET)
    public Pedido save(){
        Pedido p = new Pedido();
        p.setDataPedido("12/04/2024");
        p = this.pedidoRepository.save(p);
        return p;
    }

    @RequestMapping(value = "/pedidos", method = RequestMethod.GET)
    public List<Pedido> findAll(){
        List<Pedido> pedidos = this.pedidoRepository.findAll();
        return pedidos;
    }


    @RequestMapping(value = "/mostrarpedidos/{id}", method = RequestMethod.GET)
    public Pedido findById(@PathVariable long id){
        Optional<Pedido> resultado = this.pedidoRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Pedido não encontrada!");
        }else{
            return resultado.get();
        }
    }

    @RequestMapping(value = "/editarpedido/{id}", method = RequestMethod.PUT)
    public Pedido updateById(@PathVariable long id, @RequestBody Pedido pedido){
        this.findById(id);
        pedido.setIdPedido(id);
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }

    @RequestMapping(value = "/excluirpedido/{id}", method = RequestMethod.DELETE)
    public Pedido deleteById(@PathVariable long id){
        Pedido pedido = findById(id);
        this.pedidoRepository.deleteById(id);
        return pedido;
    }
}
