/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.repositorios;

import com.egg.Rest.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Archer
 */
@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String>{
    
    //@Query("SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    //public Cliente buscarPorNombre(@Param("nombre")String nombre);
}
