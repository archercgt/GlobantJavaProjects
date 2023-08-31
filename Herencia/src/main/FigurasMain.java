/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Circulo;
import entidad.Rectangulo;

/**
 *
 * @author Archer
 */
public class FigurasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        Circulo circulo = new Circulo(1);
        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
    
}
