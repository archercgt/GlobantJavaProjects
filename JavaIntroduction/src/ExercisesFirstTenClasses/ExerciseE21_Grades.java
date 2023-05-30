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
public class ExerciseE21_Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double[] notas = new double[10];
        int aprobados = 0, desaprobados = 0;
        for(int i = 0; i < notas.length; i++){
            System.out.println("Alumno " + (i+1));
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
            notas[i] += leer.nextDouble() * 0.10;
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
            notas[i] += leer.nextDouble() * 0.15;
            System.out.println("Ingrese la nota del primer integrador");
            notas[i] += leer.nextDouble() * 0.25;
            System.out.println("Ingrese la nota del segundo integrador");
            notas[i] += leer.nextDouble() * 0.50;
        }
        System.out.println("El vector es: ");
        for(int i = 0; i < notas.length; i++){
            if(notas[i] >=7){
                aprobados++;
            }
            else{
                desaprobados++;
            }
            System.out.print(notas[i] + " ");
        }
        System.out.println("");
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de desaprobados es: " + desaprobados);
        leer.close();
    }
}