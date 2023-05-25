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
public class ExerciseE1_Minutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = minutos/60;
        int dias = 0;
        while (dias *24 < horas){
            dias++;
        }
        dias--;
        horas = horas - (dias * 24);
        System.out.println("Los minutos ingresados corresponden a " + dias + " días y " + horas + " horas.");
        
    }
    
}
