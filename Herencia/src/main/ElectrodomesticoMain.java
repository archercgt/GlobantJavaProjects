/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class ElectrodomesticoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        int precio_lavadoras = 0, precio_televisores = 0;
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Televisor());
        electrodomesticos.add(new Televisor());
        
        for(Electrodomestico aux: electrodomesticos){
            if (aux instanceof Lavadora) {
                ((Lavadora) aux).crearLavadora();
                aux.precioFinal();
                precio_lavadoras += aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                ((Televisor) aux).crearTelevisor();
                aux.precioFinal();
                precio_televisores += aux.getPrecio();
            }
        }
        System.out.println("El precio total de las lavadoras es: $" + precio_lavadoras);
        System.out.println("El precio total de los televisores es: $" + precio_televisores);
        System.out.println("El precio total de los electrodomésticos es: $" + (precio_lavadoras + precio_televisores));
    }
}
