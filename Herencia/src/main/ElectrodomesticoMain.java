/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import entidad.Lavadora;
import entidad.Televisor;

/**
 *
 * @author Archer
 */
public class ElectrodomesticoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        lavadora.precioFinal();
//        System.out.println(lavadora);
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println(televisor);
        televisor.precioFinal();
        System.out.println(televisor);
    }
    
}
