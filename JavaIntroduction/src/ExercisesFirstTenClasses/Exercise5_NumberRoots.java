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
public class Exercise5_NumberRoots {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El doble del numero es: " + String.valueOf(num*2));
        System.out.println("El triple del numero es: " + String.valueOf(num*3));
        System.out.println("La raiz cuadrada del numero es : " + Math.sqrt(num));
        leer.close();
    }    
}
