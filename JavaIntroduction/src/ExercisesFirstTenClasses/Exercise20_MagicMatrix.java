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
public class Exercise20_MagicMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        System.out.println("La matriz creada es la siguiente:");
        imprimirMatriz(matriz);
        definirMagia(matriz);
        
    }
    
    public static void llenarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        int input;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                do{
                    System.out.println("Ingrese el valor de la posición [" + i + "][" + j + "]");
                    input = leer.nextInt();
                }while(input < 1 || input > 9);
                matriz[i][j] = input;
            }
        }
        leer.close();
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void definirMagia(int[][] matriz){
        boolean magica = true;
        int ref = 0;
        int suma;
        //Validar filas
        for(int i = 0; i < 3; i++){
            suma = 0;
            for(int j = 0; j < 3; j++){
                if(i == 0){
                    suma += matriz[i][j];
                    ref = suma;
                }
                else{
                    suma += matriz[i][j];
                }
            }
            if(suma != ref){
                magica = false;
            }
        }
        //Validar columnas
        if(magica){
            for(int j = 0; j <3; j++){
                suma = 0;
                for(int i = 0; i < 3; i++){
                    suma += matriz[i][j];
                }
                if(suma != ref){
                    magica = false;
                }
            }
        }
        //Validar diagonal principal
        if(magica){
            suma = 0;
            for (int i = 0; i < 3; i++){
                suma += matriz[i][i];
            }
            if(suma != ref){
                magica = false;
            }
        }
        //Validar diagonal secundaria
        if(magica){
            suma = 0;
            for (int i = 0; i < 3; i++){
                suma += matriz[i][2 - i];
            }
        }
        
        //Chequear si la matriz es màgica
        if(magica){
            System.out.println("La matriz es mágica");
        }
        else{
            System.out.println("La matriz NO es mágica");
        }
    }
}