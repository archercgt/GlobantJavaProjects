/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.servicios;

import com.egg.Rest.entidades.Producto;
import com.egg.Rest.repositorios.ProductoRepositorio;
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
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Transactional
    public Producto crerProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public List<Producto> leerProductos() {
        return productoRepositorio.findAll();
    }

    public Producto leerProducto(String id) {
        return productoRepositorio.findById(id).get();
    }

    @Transactional
    public Producto actualizarProducto(String id, Producto producto) {
        Optional<Producto> respuesta = productoRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Producto nuevo_producto = productoRepositorio.findById(id).get();
            nuevo_producto.setNombre(producto.getNombre());
            nuevo_producto.setPrecio(producto.getPrecio());
            productoRepositorio.save(nuevo_producto);
            return nuevo_producto;
        }
        return null;
    }
    
    @Transactional
    public void eliminarProducto(String id){
        productoRepositorio.deleteById(id);
    }
}
