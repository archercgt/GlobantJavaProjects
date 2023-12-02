/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.controladores;

import com.egg.Rest.entidades.Orden;
import com.egg.Rest.entidades.OrdenRequest;
import com.egg.Rest.repositorios.OrdenRepositorio;
import com.egg.Rest.servicios.OrdenServicio;
import java.util.Date;
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

/**
 *
 * @author Archer
 */
@RestController
@RequestMapping("/api")
public class OrdenControlador {

    @Autowired
    private OrdenServicio ordenServicio;

    @GetMapping("/ordenes")
    @ResponseStatus(HttpStatus.OK)
    public List<Orden> getOrder() {
        return ordenServicio.leerOrdenes();
    }

    @GetMapping("/orden/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Orden getOrder(@PathVariable String id) {
        return ordenServicio.leerOrden(id);
    }

    @PostMapping("/orden")
    @ResponseStatus(HttpStatus.CREATED)
    public Orden postOrder(@RequestBody OrdenRequest ordenRequest) {
        String id = ordenRequest.getId();
        Date fecha = ordenRequest.getFecha();
        return ordenServicio.crearOrden(id, fecha);
    }

//    @PutMapping("/orden/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public Orden updateOrder(@PathVariable("id") String id,
//            @RequestBody OrdenRequest ordenRequest) {
//        return ordenServicio.actualizarOrden(id, cliente);
//    }

    @DeleteMapping("orden/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable("id") String id) {
        ordenServicio.eliminarOrden(id);
    }
}
