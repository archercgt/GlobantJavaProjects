/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

/**
 *
 * @author Archer
 */
public class MainArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo_a = new double [50];
        double[] arreglo_b = new double [20];
        System.out.println("El arreglo A es: ");
        for (int i = 0; i < arreglo_a.length; i++){
            arreglo_a[i] = Math.random() * 100;
            System.out.println(arreglo_a[i] + " ");
        }
        Arrays.sort(arreglo_a);
        for (int i = 0; i < arreglo_b.length; i++){
            if(i < 10){
                arreglo_b[i] = arreglo_a[i]; 
            }
            else{
              arreglo_b[i] = 0.5;  
            }
        }
        System.out.println("");
        System.out.println("El arreglo ordenado A es: ");
        imprimirArreglo(arreglo_a);
        System.out.println("");
        System.out.println("El arreglo B es: ");
        imprimirArreglo(arreglo_b);
        
    }
    
    public static void imprimirArreglo(double [] arreglo){
        for(int i = 0; i < arreglo.length; i++ ){
            System.out.println(arreglo[i]);
        }
    }
    
}
