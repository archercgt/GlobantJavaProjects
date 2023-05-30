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
public class ExerciseE24_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número N de la sucesión");
        int n = leer.nextInt();
        int[] vector = new int[n+1];
        for(int i = 0; i <= n; i++){
            vector[i] = fibonacci(i);
        }
        imprimirVector(vector);
        leer.close();
    }
    
    public static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        else{
            int resultado = fibonacci(n - 1) + fibonacci(n - 2);
            return resultado;
        }
    }
    
    public static void imprimirVector(int [] vector){
        System.out.println("El vector creado es el siguiente: ");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] +" ");
        }
        System.out.println("");
    }
}