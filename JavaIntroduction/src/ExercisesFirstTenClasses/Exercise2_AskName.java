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
public class Exercise2_AskName {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
        leer.close();
    }
}