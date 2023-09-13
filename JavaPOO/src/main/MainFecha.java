/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class MainFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int anio, mes, dia;
        System.out.println("Ingrese un año");
        anio = leer.nextInt();
        anio -= 1900;
        System.out.println("Ingrese un mes");
        mes = leer.nextInt();
        System.out.println("Ingrese un día");
        dia = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("La fecha actual es: " + fechaActual);
        
        System.out.println("Entre la fecha actual y la fecha ingresada hay " + (fechaActual.getYear() - fecha.getYear()) + " años");
        leer.close();
    }
    
}
