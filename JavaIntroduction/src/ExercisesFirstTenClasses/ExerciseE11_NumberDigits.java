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
public class ExerciseE11_NumberDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int digitos = 0;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        do{
            num = num / 10;
            digitos++;
        }while(num > 0);
        System.out.println("La cantidad de digitos del número es: " + digitos);
        leer.close();
    }
}