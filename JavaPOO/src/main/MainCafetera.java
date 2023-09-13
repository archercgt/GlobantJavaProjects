/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class MainCafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraService cafta_servicio = new CafeteraService();
        Cafetera cafta = cafta_servicio.crearCafetera();
        System.out.println("El contenido actual es: " + cafta.getCapacidadActual());
        cafta_servicio.llenarCafetera(cafta);
        System.out.println("El contenido actual es: " + cafta.getCapacidadActual());
        cafta_servicio.servirTaza(80, cafta);
        System.out.println("El contenido actual es: " + cafta.getCapacidadActual());
        cafta_servicio.vaciarCafetera(cafta);
        System.out.println("El contenido actual es: " + cafta.getCapacidadActual());
        cafta_servicio.agragarCafe(40, cafta);
        System.out.println("El contenido actual es: " + cafta.getCapacidadActual());
    }
    
}
