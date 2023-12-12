/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.entidades;


import com.egg.Spring.enumeraciones.Rol;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Archer
 */
@Entity
public class Periodista extends Usuario{
    
    @OneToMany
    private List<Noticia> misNoticias;

    public Periodista() {
        misNoticias = new ArrayList();
    }
    
    public Periodista(String nombre, String email, String password, Rol rol){
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
        activo = true;
        fecha_alta = new Date();
        misNoticias = new ArrayList();
    }

    public List<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(List<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

}
