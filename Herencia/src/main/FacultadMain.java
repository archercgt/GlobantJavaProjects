/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Empleado;
import entidad.Estudiante;
import entidad.Persona;
import entidad.PersonalServicio;
import entidad.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class FacultadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> personas = new ArrayList();
        personas.add(new Estudiante("Matemáticas 101", "Patroclo", "Martínez Ríos", "Soltero", 12345));
        personas.add(new Profesor("Lenguajes", 1998, 4, "Morgan", "Gomez Palacio", "Casado", 234567));
        personas.add(new PersonalServicio("Biblioteca", 1995, 3, "Epifanio", "Gonzalez Mejía", "Divorciado", 345678));
        
        System.out.println("A continuación se lista la inforamción de las personas almacenadas:");
        for(Persona persona: personas){
            System.out.println(persona);
        }
        
        for(Persona persona: personas){
            if(persona instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) persona;
                estudiante.matricularNuevoCurso();
            }
            if (persona instanceof Profesor) {
                Profesor profesor = (Profesor) persona;
                profesor.cambiarDepartamento();
                profesor.reasignarDespacho();
            }
            if (persona instanceof PersonalServicio) {
                PersonalServicio personalServicio = (PersonalServicio) persona;
                personalServicio.trasladarSeccion();
            }
        }
        
        personas.get(0).cambiarEstadoCivil();
    }
}
