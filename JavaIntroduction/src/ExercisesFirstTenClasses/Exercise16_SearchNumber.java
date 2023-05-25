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
public class Exercise16_SearchNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño n que tendrá el vector");
        int tamano = leer.nextInt();
        int [] vector = new int[tamano];
        llenar(tamano, vector);
        System.out.println("Ingrese un numero a buscar en el vector");
        int numero = leer.nextInt();
        buscarNumero(numero, vector);
        imprimir(tamano, vector);
    }
    
    public static void llenar(int tamano, int[] vector){
        for(int i = 0; i < tamano; i++){
            vector[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void imprimir(int tamano, int[] vector){
        System.out.println("El vector es el siguiente:");
        for(int i = 0; i < tamano; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    
    public static void buscarNumero(int numero, int[] vector){
        int contador = 0;
        int posicion = 0;
        for(int i = 0; i < vector.length; i++){
            if (vector[i] == numero){
                contador++;
                posicion = i;
            }
        }
        if (contador > 0){
            System.out.println("El numero se encuentra en el vector en la posición " + posicion);
            if(contador > 1){
                System.out.println("El numero ingresado se encuentra repetido en el vector");
            }
        }
        else{
            System.out.println("El numero ingresado no se encontró en el vector");
        }
    }
}
