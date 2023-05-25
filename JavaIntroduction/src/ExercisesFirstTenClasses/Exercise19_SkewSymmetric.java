/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

/**
 *
 * @author Archer
 */
public class Exercise19_SkewSymmetric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        int[][] traspuesta = new int[3][3];
        llenarMatriz(matriz);
        System.out.println("La matriz creada es la siguiente:");
        imprimirMatriz(matriz);
        llenarTraspuesta(matriz, traspuesta);
        System.out.println("La matriz traspuesta es la siguiente:");
        imprimirMatriz(traspuesta);
        validarAntisimetrica(matriz, traspuesta);
    }
    
    public static void llenarMatriz(int[][] matriz){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        } 
    }
    
    public static void llenarTraspuesta(int[][] matriz, int[][]traspuesta){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                traspuesta[i][j] = matriz[j][i];
            }
        }
    }
    
    public static void validarAntisimetrica(int[][] matriz, int[][]traspuesta){
        boolean antisimetrica = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j]!= traspuesta[i][j] * -1){
                    antisimetrica  = false;
                }
            }
        }
        if(antisimetrica){
            System.out.println("La matriz es antisimetrica");
        }
        else{
            System.out.println("La matriz NO es antisimetrica");
        }
    }
    
}