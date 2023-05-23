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
public class Exercise14_CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de euros a convertir");
        int euros = leer.nextInt();
        // Consume the newline character
        leer.nextLine();
        System.out.println("Por favor ingrese la moneda a la cual se convertiran los euros: dolar/yen/libra");
        String moneda = leer.nextLine();
        convertir(euros, moneda);
        leer.close();
    }
    
    public static void convertir (int euros, String moneda){
        switch(moneda.toLowerCase()){
            case "dolar":
                System.out.println("Los euros ingresados corresponden a " + String.valueOf(euros * 1.28611) + " dolares");
                break;
            case "yen":
                System.out.println("Los euros ingresados corresponden a " + String.valueOf(euros * 129.852) + " yenes");
                break;
            case "libra":
                System.out.println("Los euros ingresados corresponden a " + String.valueOf(euros * 0.86) + " libras");
                break;
            default:
                System.out.println("Moneda ingresada incorrecta");
                break;
        }       
    }
}