/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean encontrado = false;
        int num_usuario = 0, intentos = 0;

        int num_aleatorio = random.nextInt(500) + 1;
        while (!encontrado) {
            System.out.println("Trata de adivinar el número entre 1 y 500");
            intentos += 1;
            try {
                num_usuario = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Hubo una excepción de tipo Input Mismatch");
                leer.next();
            }
            if (num_usuario == num_aleatorio) {
                encontrado = true;
                System.out.println(num_usuario + " era el número a adivinar");
                System.out.println("Se hicieron " + intentos + " intentos para encontrarlo");
            } else if (num_aleatorio > num_usuario) {
                System.out.println("El número a adivinar es mayor");
            } else {
                System.out.println("El número a adivinar es menor");
            }
        }
    }
}
