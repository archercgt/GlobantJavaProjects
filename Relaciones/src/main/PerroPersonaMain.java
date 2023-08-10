/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;

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
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        perros.add(pe1);
        perros.add(pe2);
        personas.add(p1);
        personas.add(p2);
        Persona.agregarPerros(perros);
        p1.adoptarPerro();
        p2.adoptarPerro();
        System.out.println("Lista de personas");
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }
    
}
