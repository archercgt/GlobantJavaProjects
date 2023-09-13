/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Archer
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int debajo = 0, ideal = 0, encima = 0, menores = 0, mayores = 0;
        PersonaService per_servicio = new PersonaService();
        Persona[] listado = new Persona[4];
        listado[0] = per_servicio.crearPersona();
        listado[1] = per_servicio.crearPersona();
        listado[2] = per_servicio.crearPersona();
        listado[3] = per_servicio.crearPersona();

        
        
        for(int i = 0; i < listado.length; i++){
            int temp = per_servicio.calcularIMC(listado[i]);
            switch(temp){
                case -1:
                    debajo += 1;
                    break;
                case 0: 
                    ideal += 1;
                    break;
                case 1:
                    encima += 1;
                    break;
            }

            if(per_servicio.esMayorDeEdad(listado[i])){
                mayores += 1;
            }
            else{
                menores += 1;
            }
        }
        System.out.println("Debajo " + debajo);
        System.out.println("Ideal " + ideal);
        System.out.println("Encima " + encima);
        System.out.println("Menores " + menores);
        System.out.println("Mayores " + mayores);
        System.out.println("Porcentaje por debajo del peso ideal: " + debajo*100/4);
        System.out.println("Porcentaje en peso ideal: " + ideal*100/4);
        System.out.println("Porcentaje por encima del peso ideal: " + encima*100/4);
        System.out.println("Porcentaje mayores de edad: " + mayores*100/4);
        System.out.println("Porcentaje menores de edad: " + menores*100/4);
    }
}