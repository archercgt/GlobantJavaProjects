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
public class ExerciseE17_PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        if(verificarPrimo(numero)){
            System.out.println("El número ingresado es primo");
        }
        else{
            System.out.println("El número ingresado NO es primo");
        }
        leer.close();
    }
    
    public static boolean verificarPrimo(int numero){
        boolean primo = true;
        int i = 2;
        if(numero > 1){
            while(primo && i < numero){
                if(numero % i == 0){
                    primo = false;
                }
                i++;
            }
        }
        return primo;
    } 
}