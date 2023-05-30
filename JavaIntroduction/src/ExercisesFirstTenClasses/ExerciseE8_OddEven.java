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
public class ExerciseE8_OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numLeidos = 0, numPares = 0, numImpares = 0, num;
        do{
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            numLeidos++;
            if(num % 2 == 0){
                numPares++;
            }
            else {
                numImpares++;
            }
        }while(num % 5 != 0);
        System.out.println("La cantidad de numeros leídos fue: " + numLeidos);
        System.out.println("La cantidad de numeros pares fue: " + numPares);
        System.out.println("La cantidad de numeros imapares fue: " + numImpares);
        leer.close();
    }
}