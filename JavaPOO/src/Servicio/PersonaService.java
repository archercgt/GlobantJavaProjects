/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class PersonaService {
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona per = new Persona();
        System.out.println("Ingrese el nombre");
        per.setNombre(leer.nextLine());      
        System.out.println("Ingrese la edad");
        per.setEdad(leer.nextInt());
        leer.nextLine(); // Consume the remaining newline character
        System.out.println("Ingrese el peso en kg");
        per.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en metros");
        per.setAltura(leer.nextDouble());
        leer.nextLine(); // Consume the remaining newline character
        String sexo;
        do {
            System.out.println("Ingrese el sexo");
            sexo = leer.nextLine();
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
        per.setSexo(sexo);
        
        return per;
    }

    
    public int calcularIMC(Persona per){
        double calculo = per.getPeso()/(Math.pow(per.getAltura(), 2));
        if(calculo < 20){
            return -1;
        }
        else if(20 <= calculo && calculo <= 25){
            return 0;
        }
        else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona per){
        if (per.getEdad() > 18){
           return true;
        }
        else {
            return false;
        }
    }
}
