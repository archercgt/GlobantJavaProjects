/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.entidades;

import java.util.ArrayList;
import javax.persistence.Entity;

/**
 *
 * @author Archer
 */
@Entity
public class Periodista extends Usuario{
    
    private ArrayList<Noticia> misNoticias;
    private Integer sueldoMensual;

    public Periodista() {
    }
    
    
    
}
