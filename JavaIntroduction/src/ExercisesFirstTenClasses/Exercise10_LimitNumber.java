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
public class Exercise10_LimitNumber {
    public static void main(String[] args){
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor el número límite");
        int limite = leer.nextInt();
        while(suma < limite){
            System.out.println("Por favor ingrese un numero");
            suma += leer.nextInt();
        }
        System.out.println("La suma final fue: " + suma);
        leer.close();
    }     
}