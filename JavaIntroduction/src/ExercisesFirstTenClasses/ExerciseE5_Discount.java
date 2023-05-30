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
public class ExerciseE5_Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la letra a, b ó c para definir la categoría del socio");
        String letra = leer.nextLine();
        letra = letra.toLowerCase();
        System.out.println("Por favor ingrese el valor del tratamiento");
        int valor = leer.nextInt();
        switch(letra){
            case "a":
                System.out.println("El valor del tratamiento con el descuento es: " + valor * 0.5);
                break;
            case "b":
                System.out.println("El valor del tratamiento con el descuento es: " + valor * 0.65);
                break;
            case "c":
                System.out.println("El valor del tratamiento es: " + valor);
                break;
            default:
                System.out.println("Ingresó una letra errónea");
        }
        leer.close();
    }
}