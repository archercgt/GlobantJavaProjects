/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Persona2;
import Servicio.Persona2Service;

/**
 *
 * @author Archer
 */
public class MainPersona2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona2Service p2_servicio = new Persona2Service();
        Persona2 persona = p2_servicio.crearPersona();
        System.out.println(persona.getNombre() + " tiene " + p2_servicio.calcularEdad(persona) + " años");;
        System.out.println("Es menor: " + p2_servicio.menorQue(25, persona));
        p2_servicio.mostrarPersona(persona);
    }
    
}
