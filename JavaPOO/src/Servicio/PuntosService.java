/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class PuntosService {

    public PuntosService() {
    }
    
    public Puntos crearPuntos(){
        double x1, y1, x2, y2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese el valor de y1");
        y1 = leer.nextDouble();
        System.out.println("Ingrese el valor de x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el valor de y2");
        y2 = leer.nextDouble();
        Puntos mis_puntos = new Puntos(x1, y1, x2, y2);
        leer.close();
        return mis_puntos;
    }
    
    public double calcularDistancia(Puntos mis_puntos){
        double distancia = Math.sqrt(Math.pow((mis_puntos.getX2() - mis_puntos.getX1()), 2) 
                + Math.pow((mis_puntos.getY2() - mis_puntos.getY1()), 2));
        return distancia;
    }
}