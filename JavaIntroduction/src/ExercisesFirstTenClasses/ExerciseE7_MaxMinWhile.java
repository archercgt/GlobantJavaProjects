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
public class ExerciseE7_MaxMinWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que se ingresarán");
        int numeros = leer.nextInt();
        int i = 0, suma = 0, max = 0, min = 0, temp;
        while(i < numeros){
            System.out.println("Ingrese un numero");
            temp = leer.nextInt();
            if (i == 0){
                max = temp;
                min = temp;
                suma += temp;
            }
            else{
                if(temp > max){
                    max = temp;
                }
                if (temp < min){
                    min = temp;
                }
                suma += temp;
            }
            i++;
        }
        System.out.println("El promedio de los numero ingresados es: " + suma/numeros);
        System.out.println("El máximo valor encontrado es: " + max);
        System.out.println("El mínimo valor encontrado es: " + min);
        leer.close();
    }    
}