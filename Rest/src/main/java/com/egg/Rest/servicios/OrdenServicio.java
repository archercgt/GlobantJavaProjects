/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.servicios;

import com.egg.Rest.entidades.Cliente;
import com.egg.Rest.entidades.Orden;
import com.egg.Rest.repositorios.ClienteRepositorio;
import com.egg.Rest.repositorios.OrdenRepositorio;
import java.util.Date;
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
public class OrdenServicio {

    @Autowired
    private OrdenRepositorio ordenRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Transactional
    public Orden crearOrden(String id, Date fecha) {
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Cliente cliente = clienteRepositorio.findById(id).get();
            Orden orden = new Orden(fecha, cliente);
            ordenRepositorio.save(orden);
            return orden;
        }
        return null;
    }

    @Transactional
    public Orden actualizarOrden(String id, String id_request, Date fecha) {
        Optional<Orden> respuesta = ordenRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Orden orden = ordenRepositorio.findById(id).get();
            orden.setFecha(fecha);
            Optional<Cliente> respuesta2 = clienteRepositorio.findById(id_request);
            if (respuesta2.isPresent()){
                Cliente cliente = clienteRepositorio.findById(id_request).get();
                orden.setCliente(cliente);
                ordenRepositorio.save(orden);
            }
            return orden;
        }
        return null;
    }

    public List<Orden> leerOrdenes() {
        return ordenRepositorio.findAll();
    }

    public Orden leerOrden(String id) {
        return ordenRepositorio.findById(id).get();
    }

    @Transactional
    public void eliminarOrden(String id) {
        ordenRepositorio.deleteById(id);
    }
}
