/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        num1 = 2;
        num2 = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
            System.out.println("Ingrese el primer número");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número");
            num2 = leer.nextInt();
            System.out.println("La división de los números es: " + (num1/num2));
        }catch(InputMismatchException e){
            System.out.println("Se generó una excepción por el ingreso de un tipo de dato incorrecto");
        }catch(ArithmeticException e){
            System.out.println("An excepcion was found: " + e.getMessage());
        }
    }
}
