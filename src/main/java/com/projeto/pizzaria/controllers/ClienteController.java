package com.projeto.pizzaria.controllers;

import com.projeto.pizzaria.models.Cliente;
import com.projeto.pizzaria.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @RequestMapping(value = "/cadastrarcliente", method = RequestMethod.GET)
    public Cliente save(){
        Cliente c = new Cliente();
        c.setNome("Julia");
        c.setEndereco("Rua Número 1, 12");
        c.setTelefone("12345-6789");
        c.setLogin("julia@email.com");
        c.setSenha("******");
        c = this.clienteRepository.save(c);
        return c;
    }

    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public List<Cliente> findAll(){
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;
    }


    @RequestMapping(value = "/mostrarclientes/{id}", method = RequestMethod.GET)
    public Cliente findById(@PathVariable long id){
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if (resultado.isEmpty()){
            throw new RuntimeException("Cliente não encontrado!");
        }else{
            return resultado.get();
        }
    }

    @RequestMapping(value = "/editarcliente/{id}", method = RequestMethod.PUT)
    public Cliente updateById(@PathVariable long id, @RequestBody Cliente cliente){
        this.findById(id);
        cliente.setIdCliente(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }

    @RequestMapping(value = "/excluircliente/{id}", method = RequestMethod.DELETE)
    public Cliente deleteById(@PathVariable long id){
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }
}
