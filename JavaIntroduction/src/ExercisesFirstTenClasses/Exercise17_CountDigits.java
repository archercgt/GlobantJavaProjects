/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Exercise17_CountDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que tendrá el vector");
        int tamano = leer.nextInt();
        int [] vector = new int [tamano];
        llenarVector(tamano, vector);
        contarDigitos(vector);
        imprimir(vector);
        leer.close();
    }

    public static void llenarVector(int tamano, int [] vector){
        for(int i = 0; i < tamano; i++){    
            vector[i] = AzarPorCantDigitos(1, 5);
        }
    }
    
    public static int determinarDigitos(int elemento){
        String elementoString = String.valueOf(elemento);
        return elementoString.length();
    }
    
    public static void contarDigitos(int[] vector){
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        int digitos = 0;
        for (int i = 0; i <vector.length; i++){
            digitos = determinarDigitos(vector[i]);
            switch (digitos){
                case 1: unDigito++;
                    break;
                case 2: dosDigitos++;
                    break;
                case 3: tresDigitos++;
                    break;
                case 4: cuatroDigitos++;
                    break;
                case 5: cincoDigitos++;
                    break;
            }
        }
        System.out.println("Se encontraron " + String.valueOf(unDigito) + " elementos con un digito");
        System.out.println("Se encontraron " + String.valueOf(dosDigitos) + " elementos con dos digitos");
        System.out.println("Se encontraron " + String.valueOf(tresDigitos) + " elementos con tres digitos");
        System.out.println("Se encontraron " + String.valueOf(cuatroDigitos) + " elementos con cuatro digitos");
        System.out.println("Se encontraron " + String.valueOf(cincoDigitos) + " elementos con cinco digitos");
    }
    
    public static void imprimir(int[] vector){
        System.out.println("El vector es el siguiente:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    
    // -----------------------------------------------------
    // Devuelve un entero positivo al azar que sea de una cantidad
    // de dígitos entre "digitosMin" y "digitosMax"
    // con misma probabilidad para cualquier cantidad de dígitos
    // dentro de ese rango.  
    // Ej: AzarPorCantDigitos(1,2) debería devolver números entre 0 y 99.
    //     AzarPorCantDigitos(3,5) debería devolver números entre 100 y 99999.
    public static int AzarPorCantDigitos(int digitosMin, int digitosMax) {

        int num, numDigitosAleatorio, maximo, minimo;

        // Para generar un número aleatorio entre 0 y 99999...
        // Si se usa directamente "(math.random() * 10.000)"
        // la probabilidad de generar un número de "n" dígitos aumenta 
        // cuanto mayor sea el valor de "n".
        // Por lo que va a haber muchísimos números de 5 dígitos
        // menos de 4, pocos de 3, casi ninguno de 2 y casi imposible de 1.        
        // 
        // Para igualar la probabilidad de recibír un número aleatorio de
        // 1, 2, 3, 4 o 5 dígitos o los que sea, 
        // primero se elije un número aleatorio
        // entre 1 y 5 (o el rango que sea) y luego se genera un número aleatorio
        // con <esa> cantidad de dígitos.     
        // Elije un número al azar entre digitosMin y digitosMax.
        numDigitosAleatorio = (int) ((Math.random() * digitosMax) + digitosMin);

        // Genera un número aleatorio con esa cantidad de dígitos.
        maximo = (int) Math.pow(10, numDigitosAleatorio);
        minimo = (int) Math.pow(10, numDigitosAleatorio - 1);
        num = (int) ((Math.random() * (maximo - minimo) + 1) + minimo);

        // Notas:
        // 0..9          <-- numDigitosAleatorio = 1
        // 10..99        <-- numDigitosAleatorio = 2
        // 100..999      <-- numDigitosAleatorio = 3
        // 1000...9999   <-- numDigitosAleatorio = 4
        // 10000..99999  <-- numDigitosAleatorio = 5
        // Para generar un número aleatorio entre min y max...
        // (Math.random() * (max - min) + 1) + min;
        // https://stackoverflow.com/questions/7961788/math-random-explanation
        // ------------------------------------------------------------------------
        // ------------------------------------------------------------------------
        return num;
    }
}
