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
public class ExerciseE4_RomanNumerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese un número entre 1 y 10");
            numero = leer.nextInt();
        }while (numero < 1 || numero > 10);
        switch(numero){
            case 1:
                System.out.println("El equivalente romano es: I");
                break;
            case 2:
                System.out.println("El equivalente romano es: II");
                break;
            case 3:
                System.out.println("El equivalente romano es: III");
                break;
            case 4:
                System.out.println("El equivalente romano es: IV");
                break;
            case 5:
                System.out.println("El equivalente romano es: V");
                break;
            case 6:
                System.out.println("El equivalente romano es: VI");
                break;
            case 7:
                System.out.println("El equivalente romano es: VII");
                break;
            case 8:
                System.out.println("El equivalente romano es: VIII");
                break;
            case 9:
                System.out.println("El equivalente romano es: IX");
                break;
            case 10:
                System.out.println("El equivalente romano es: X");
                break;                       
        }
        leer.close();
    }
}