/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class ExerciseE9_DivisionSubstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el divisor");
        int divisor = leer.nextInt();
        System.out.println("Ingrese el dividendo");
        int dividendo = leer.nextInt();
        do{
            divisor = divisor - dividendo;
            contador++;
        }while(divisor > dividendo);
        System.out.println("El residuo es: " + divisor);
        System.out.println("El cociente es: " + contador);
        leer.close();
    }
}