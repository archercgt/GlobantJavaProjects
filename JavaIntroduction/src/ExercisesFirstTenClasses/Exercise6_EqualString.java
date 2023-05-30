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
public class Exercise6_EqualString {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Frase errónea");
        }
        leer.close();
    }
}