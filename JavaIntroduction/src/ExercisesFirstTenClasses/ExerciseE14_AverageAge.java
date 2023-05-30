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
public class ExerciseE14_AverageAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumaEdades = 0;
        int familias, hijos;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        familias = leer.nextInt();
        System.out.println("Ingrese la cantidad de hijos");
        hijos = leer.nextInt();
        for(int i = 1; i <= familias; i++){
            System.out.println("Familia " + i);
            for(int j = 1; j <= hijos; j++){
                System.out.println("Ingrese la edad del hijo numero " + j);
                sumaEdades += leer.nextInt();
            }
        }
        System.out.println("El promedio de las edades de todos los hijos es: " + sumaEdades/(familias*hijos));
    }
    
}