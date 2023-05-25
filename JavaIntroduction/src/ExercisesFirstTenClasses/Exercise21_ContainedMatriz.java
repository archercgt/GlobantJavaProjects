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
public class Exercise21_ContainedMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]matriz10 = new int[10][10];
        int[][]matriz3 = new int[3][3];
        llenarMatriz(matriz10, 10);
        llenarMatriz(matriz3, 3);
        //Incluir la matriz de 3*3 en la matriz de 10*10
        incluirMatriz(matriz10, matriz3);
        System.out.println("La matriz 3*3 es:");
        imprimirMatriz(matriz3, 3);
        System.out.println("La matriz 10*10 es:");
        imprimirMatriz(matriz10, 10);
        encontrarExtremo(matriz10, matriz3);
    }
    
    public static void llenarMatriz(int[][]matriz, int tamano){
        for (int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    
    public static void imprimirMatriz(int[][]matriz, int tamano){
        for (int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void incluirMatriz(int[][]matriz10, int[][]matriz3){
        for (int i = 4; i < 7; i++){
            for (int j = 4; j < 7; j++){
                matriz10[i][j] = matriz3[i - 4][j - 4];
            }
        }
    }
    
    public static boolean validarIncluida(int[][]matriz10, int[][]matriz3, int fila, int columna){
        boolean igual = true;
        for (int i = fila; i < fila + 3; i++){
            for(int j = columna; j < columna + 3; j++){
                if(matriz10[i][j] != matriz3[i-fila][j-columna]){
                    igual = false;
                }
            }
        }
        return igual;
    }
    
    public static void encontrarExtremo(int[][]matriz10, int[][]matriz3){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(matriz10[i][j] == matriz3[0][0]){
                    if(validarIncluida(matriz10, matriz3, i, j)){
                        String resultado = "";
                        for(int k = 0; k < 3; k++){
                            for(int l = 0; l <3; l++){
                                resultado += String.valueOf(i+k) + "," + String.valueOf(j+l) + " ";
                            }
                        }
                        System.out.println("La matriz 3*3 está contenida en la matriz 10*10 en los subindices " + resultado);  
                    }
                }
            }
        }
    }
}
