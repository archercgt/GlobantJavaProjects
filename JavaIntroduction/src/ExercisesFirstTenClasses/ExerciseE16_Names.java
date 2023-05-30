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
public class ExerciseE16_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean seguir = true;
        int personas;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        personas = leer.nextInt();
        leer.nextLine(); // Consume the newline character after reading an integer
        String[] nombres = new String[personas];
        int[] edades = new int[personas];
        for (int i = 0; i < personas; i++){
            System.out.println("Ingrese un nombre");
            nombres[i] = leer.nextLine();
            System.out.println("Ingrese una edad");
            edades[i] = leer.nextInt();
            leer.nextLine(); // Consume the newline character after reading an integer
        }
        System.out.println("");
        System.out.println("Impresión de personas");
        int i = 0;
        while(seguir && i < nombres.length){
            System.out.print(nombres[i] + " ");
            if(edades[i] >= 18 ){
                System.out.println("es mayor de edad");
            }
            else {
                System.out.println("es menor de edad");
            }
            System.out.println("Desea continuar? s/n");
            String temp = leer.nextLine();
            if(temp.toLowerCase().equals("n")){
                seguir = false;
                System.out.println("Gracias, vuelva pronto");
            }
            i++;
        }
        leer.close();
    }
}