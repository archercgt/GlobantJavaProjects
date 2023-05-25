/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Exercise17_CountDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que tendrá el vector");
        int tamano = leer.nextInt();
        int [] vector = new int [tamano];
        llenarVector(tamano, vector);
        contarDigitos(vector);
        imprimir(vector);
    }

    public static void llenarVector(int tamano, int [] vector){
        double min = 1.0;
        double max = 99999.0;  // Maximum value
        for(int i = 0; i < tamano; i++){
            
            vector[i] = (int)ThreadLocalRandom.current().nextDouble(min, max);
        }
    }
    
    public static int determinarDigitos(int elemento){
        String elementoString = String.valueOf(elemento);
        return elementoString.length();
    }
    
    public static void contarDigitos(int[] vector){
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        int digitos = 0;
        for (int i = 0; i <vector.length; i++){
            digitos = determinarDigitos(vector[i]);
            switch (digitos){
                case 1: unDigito++;
                    break;
                case 2: dosDigitos++;
                    break;
                case 3: tresDigitos++;
                    break;
                case 4: cuatroDigitos++;
                    break;
                case 5: cincoDigitos++;
                    break;
            }
        }
        System.out.println("Se encontraron " + String.valueOf(unDigito) + " elementos con un digito");
        System.out.println("Se encontraron " + String.valueOf(dosDigitos) + " elementos con dos digitos");
        System.out.println("Se encontraron " + String.valueOf(tresDigitos) + " elementos con tres digitos");
        System.out.println("Se encontraron " + String.valueOf(cuatroDigitos) + " elementos con cuatro digitos");
        System.out.println("Se encontraron " + String.valueOf(cincoDigitos) + " elementos con cinco digitos");
    }
    
    public static void imprimir(int[] vector){
        System.out.println("El vector es el siguiente:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
}
