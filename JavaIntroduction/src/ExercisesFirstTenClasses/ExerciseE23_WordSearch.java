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
public class ExerciseE23_WordSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        llenarMatrizVacia(sopa);
        for(int i = 1; i <= 5; i++){
            do{
                System.out.println("Ingrese una palabra que contenga entre 3 y 5 caracteres");
                palabra = leer.nextLine();
            }while(palabra.length() < 3 || palabra.length() > 5);
            agregarPalabra(palabra, sopa);
        }
        llenarMatriz(sopa);
        imprimirSopa(sopa);
        leer.close();
    }
    
    public static void llenarMatrizVacia(String[][]sopa){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                sopa[i][j] = "";
            }
        }
    }
    
    public static void agregarPalabra(String palabra, String[][] sopa){
        int fila;
        int columna;
        do{
            fila = (int)(Math.random()*19);
        }while(!chequearFilaLibre(fila, sopa));
        columna = (int)(Math.random()*19);
        if ((columna + palabra.length()) > 19){
            columna = columna - palabra.length();
        }
        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila][columna + i] = palabra.substring(i, i+1);
        }       
    }
    
    public static boolean chequearFilaLibre(int fila, String[][] sopa){
        boolean disponible = true;
        for(int j = 0; j < 20; j++){
            if(!sopa[fila][j].equals("")){
                disponible = false;
            }
        }
        return disponible;
    }
    
    public static void imprimirSopa(String[][] sopa){
        System.out.println("Esta es la matriz creada: ");
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }    
    }
    
    public static void llenarMatriz(String[][] sopa){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                if(sopa[i][j].equals("")){
                    sopa[i][j] = String.valueOf((int)(Math.random()*9));
                }
            }
        }
    }
}