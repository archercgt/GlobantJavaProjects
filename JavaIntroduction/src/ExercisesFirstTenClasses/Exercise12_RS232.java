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
public class Exercise12_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int correctas = 0;
        int incorrectas = 0;
        boolean salir = false;
        String cadena;
        Scanner leer = new Scanner(System.in);
        while(!salir){
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            if (cadena.length()==5){
                if (cadena.equals("&&&&&")){
                    System.out.println("La cantidad de entradas correctas es: " + correctas);
                    System.out.println("La cantidad de entradas correctas es: " + correctas);
                    salir = true;
                    leer.close();
                }
                else if(cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length() - 1).equals("O")){
                    correctas++;
                    System.out.println("Cadena correcta");
                }
                else{
                    incorrectas++;
                    System.out.println("Cadena incorrecta");
                }
            }
            else {
                incorrectas++;
                System.out.println("Cadena incorrecta");
            }
        }
    }
}