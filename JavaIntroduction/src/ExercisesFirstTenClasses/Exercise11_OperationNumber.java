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
public class Exercise11_OperationNumber {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Por favor ingrese el segundo numero");
        int num2 = leer.nextInt();
        boolean salir = false;
        int opcion;
        String op;
        while(!salir){
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los numeros es: " + String.valueOf(num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es : " + String.valueOf(num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los numeros es : " + String.valueOf(num1 * num2));
                    break;
                case 4:
                    if (num2 != 0){
                        System.out.println("La división de los numeros es : " + String.valueOf(num1 / num2));
                        break;
                    }
                    else {
                       System.out.println("La división entre cero no es posible");
                       break;
                    }
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    Scanner leer2 = new Scanner(System.in);
                    op = leer2.nextLine();
                    switch(op.toLowerCase()){
                        case "s":
                            salir = true;
                            System.out.println("Gracias, vuelva pronto");
                            leer.close();
                            leer2.close();
                            break;
                        case "n":
                            break;
                        default:
                            System.out.println("Ingresó una opción invalida");
                            break;
                    }
                    break;
                default:
                    System.out.println("Ingresó una opción invalida");
                    break;  
            }
        }
    }    
}
