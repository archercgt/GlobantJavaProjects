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
public class Exercise4_ToFahrenheit {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la temperatura en grados centigrados");
        int temp = leer.nextInt();
        int tempF = 32 + (9 * temp / 5);
        System.out.println("La temperatura en Fahrenheit es : " + tempF);
        leer.close();
    }    
}