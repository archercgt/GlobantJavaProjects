/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.servicios;

import com.egg.Rest.entidades.Cliente;
import com.egg.Rest.repositorios.ClienteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Archer
 */
@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Transactional
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    public List<Cliente> leerClientes() {
        return clienteRepositorio.findAll();
    }

    public Cliente leerCliente(String id) {
        return clienteRepositorio.findById(id).get();
    }

    @Transactional
    public Cliente actualizarCliente(String id, Cliente cliente) {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Cliente nuevo_cliente = clienteRepositorio.findById(id).get();
            nuevo_cliente.setNombre(cliente.getNombre());
            nuevo_cliente.setEmail(cliente.getEmail());
            nuevo_cliente.setTelefono(cliente.getTelefono());
            clienteRepositorio.save(nuevo_cliente);
            return nuevo_cliente;
        }
        return null;
    }

    @Transactional
    public void eliminarCliente(String id) {
        clienteRepositorio.deleteById(id);
    }
}
