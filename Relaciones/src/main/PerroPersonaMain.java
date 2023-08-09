/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Perro;
import entidad.Persona;

/**
 *
 * @author Archer
 */
public class PerroPersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Perro pe1 = new Perro();
        Perro pe2 = new Perro();
        p1.setPerro(pe1);
        p2.setPerro(pe2);
        pe1.setNombre("Firulais");
        pe1.setEdad(9);
        pe1.setRaza("Pincher");
        pe1.setTamano("Mediano");
        pe2.setNombre("Chiqui");
        pe2.setEdad(8);
        pe2.setRaza("Chiguagua");
        pe2.setTamano("Pequeno");
        p1.setNombre("Popeye");
        p1.setApellido("Ramirez");
        p1.setDocumento(5555555);
        p1.setEdad(25);
        p2.setNombre("Carmenza");
        p2.setApellido("Rivas");
        p2.setDocumento(666666666);
        p2.setEdad(30);
        
        System.out.println(p1);
        System.out.println(p2);     
    }
    
}
