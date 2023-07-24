/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class EnterosService {
    private ArrayList<Integer> numeros;
    private Scanner leer;
    
    public EnterosService() {
    numeros = new ArrayList();
    leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarNumeros(){
        Integer numero;
        do{
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if(numero != -99){
                numeros.add(numero);
            }
        }while(numero != -99);
    }
    
    public void mostrarNumeros(){
        Integer suma = 0;
        System.out.println("Los números almacenados fueron: ");
        for(Integer numero: numeros){
            suma += numero;
            System.out.println(numero);
        }
        System.out.println("La suma de los número almacenados es: " + suma);
        System.out.println("El promedio de los números almacenados es: " + suma/numeros.size());
    }
}
