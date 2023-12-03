/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.controladores;

import com.egg.Rest.entidades.Cliente;
import com.egg.Rest.servicios.ClienteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Archer
 */
@RestController
@RequestMapping("/api")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/clientes")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getClient() {
        return clienteServicio.leerClientes();
    }

    @GetMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente getClient(@PathVariable String id) {
        return clienteServicio.leerCliente(id);
    }

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente postClient(@RequestBody Cliente cliente) {
        return clienteServicio.crearCliente(cliente);
    }

    @PutMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente updateClient(@PathVariable("id") String id,
            @RequestBody Cliente cliente) {
        return clienteServicio.actualizarCliente(id, cliente);
    }

    @DeleteMapping("cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@PathVariable("id") String id) {
        clienteServicio.eliminarCliente(id);
    }
}
