/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.controladores;

import com.egg.Rest.entidades.Cliente;
import com.egg.Rest.repositorios.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Archer
 */
@RestController
@RequestMapping("/api")
public class ClienteControlador {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @GetMapping("/cliente")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getUsers() {
        return clienteRepositorio.findAll();
    }

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente postClient(@RequestBody Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
}
