/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Movil;

/**
 *
 * @author Archer
 */
public class MainMovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Movil movil_prueba = new Movil();
        movil_prueba.cargarCelular();
        System.out.println(movil_prueba.toString());
    }
    
}
