/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.controladores;

import com.egg.Rest.entidades.Producto;
import com.egg.Rest.servicios.ProductoServicio;
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
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos")
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getProduct() {
        return productoServicio.leerProductos();
    }

    @GetMapping("/producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto getProduct(@PathVariable String id) {
        return productoServicio.leerProducto(id);
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto postProduct(@RequestBody Producto producto) {
        return productoServicio.crerProducto(producto);
    }

    @PutMapping("/producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto updateProduct(@PathVariable("id") String id,
            @RequestBody Producto producto) {
            return productoServicio.actualizarProducto(id, producto);
    }

    @DeleteMapping("producto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable("id") String id) {
        productoServicio.eliminarProducto(id);
    }    
}
