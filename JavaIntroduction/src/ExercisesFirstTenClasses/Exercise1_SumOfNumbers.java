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
public class Exercise1_SumOfNumbers {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Por favor ingrese el segundo número");
        int num2 = leer.nextInt();
        System.out.println("La suma de los numeros ingresados es: " + String.valueOf(num1+num2));
    }
}