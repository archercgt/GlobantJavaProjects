/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.servicios;

import com.egg.Rest.entidades.Cliente;
import com.egg.Rest.excepciones.MiExcepcion;
import com.egg.Rest.repositorios.ClienteRepositorio;
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
    public void crearCliente(Cliente cliente) throws MiExcepcion{
        clienteRepositorio.save(cliente);
    }

    private void validar(String nombre, String email, String telefono) throws MiExcepcion {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("El nombre no puede ser nulo");
        }

        if (email == null || email.isEmpty()) {
            throw new MiExcepcion("El email no puede ser nulo");
        }

        if (telefono == null || telefono.isEmpty()) {
            throw new MiExcepcion("El telefono no puede ser nulo");
        }
    }
}
