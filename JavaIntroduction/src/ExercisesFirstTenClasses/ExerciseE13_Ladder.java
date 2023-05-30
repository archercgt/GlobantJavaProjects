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
public class ExerciseE13_Ladder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nùmero entero que represente la altura de la escalera");
        int altura = leer.nextInt();
        System.out.println("");
        for(int i = 1; i <= altura; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print(j);
            }
            System.out.println("");
        }
        leer.close();
    }
}