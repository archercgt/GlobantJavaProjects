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
public class ExerciseE6_Height {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que se ingresarán");
        int personas = leer.nextInt();
        int personasBajas = 0;
        double sumaAlturas = 0;
        double sumaBajas = 0;
        for (int i = 0; i < personas; i++){
            System.out.println("Por favor ingrese una altura");
            double temp = leer.nextDouble();
            sumaAlturas += temp;
            if(temp < 1.6){
                personasBajas++;
                sumaBajas += temp;
            }
        }
        System.out.println("El promedio de las alturas totales es: " + sumaAlturas/personas);
        if(personasBajas > 0){
            System.out.println("El promedio de las alturas de las personas bajas es: " + sumaBajas/personasBajas);
        }
        else{
            System.out.println("No hay personas bajas");
        }
        leer.close();
    }
}