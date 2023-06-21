/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona2;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Persona2Service {
    public Persona2 crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona2 persona = new Persona2();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese el año de nacimiento de la persona");
        int anio = leer.nextInt();
        anio -= 1900;
        System.out.println("Ingrese el mes de nacimiento de la persona");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento de la persona");
        int dia = leer.nextInt();
        Date fecha_nacimiento = new Date(anio, mes, dia);
        persona.setFecha_nacimiento(fecha_nacimiento);
        return persona;
    }
    
    public int calcularEdad(Persona2 persona){
        Date fecha_actual = new Date();
        return (fecha_actual.getYear() - persona.getFecha_nacimiento().getYear());
    }
    
    public boolean menorQue(int edad, Persona2 persona){
        if(calcularEdad(persona) < edad){
            return true;
        }
        else
            return false;
    }
    
    public void mostrarPersona(Persona2 persona){
        System.out.println(persona.toString());
    }
}
