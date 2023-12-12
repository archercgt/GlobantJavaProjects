/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.entidades;

import com.egg.Spring.enumeraciones.Rol;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Archer
 */
@Entity
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombre, String email, String password, Rol rol) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
        activo = true;
        fecha_alta = new Date();
    }
}
