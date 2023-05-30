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
public class ExerciseE10_RandomMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int producto = num1 * num2;
        int adivinado;
        System.out.println("producto " + producto);
        do{
            System.out.println("ingrese un numero producto de dos numeros aleatorios entre 0 y 10");
            adivinado = leer.nextInt();
        }while(producto != adivinado);
    }
}
