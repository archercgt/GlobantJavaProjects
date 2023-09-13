/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Persona;

/**
 *
 * @author Archer
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = null;
        try{
            persona.esMayorDeEdad();
        }catch(Exception e){
            System.out.println("El mensaje capturado por la excepción corresponde a: " + e.getMessage());
        }
    }
}
