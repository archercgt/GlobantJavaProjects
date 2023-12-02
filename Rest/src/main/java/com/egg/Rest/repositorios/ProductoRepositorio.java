/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.repositorios;

import com.egg.Rest.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Archer
 */
@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String>{
    
}
