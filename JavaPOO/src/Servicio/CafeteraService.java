/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class CafeteraService {
    public Cafetera crearCafetera(){
        Scanner leer = new Scanner(System.in);
        Cafetera cafta = new Cafetera();
        System.out.println("Ingrese la capacidad màxima de la cafetera");
        cafta.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la capacidad actual de la cafetera");
        cafta.setCapacidadActual(leer.nextInt());
        leer.close();
        return cafta;
    }
    
    public void llenarCafetera(Cafetera cafta){
        cafta.setCapacidadActual(cafta.getCapacidadMaxima());
    }
    
    public void servirTaza(int taza, Cafetera cafta){
        if (taza > cafta.getCapacidadActual()){
            System.out.println("La taza no se llenó por completo y quedó con " + cafta.getCapacidadActual() + "ml de cafe");
            cafta.setCapacidadActual(0);
        }
        else{
            cafta.setCapacidadActual(cafta.getCapacidadActual() - taza);
            System.out.println("La taza se llenó completamente");
        }   
    }
    
    public void vaciarCafetera(Cafetera cafta){
        cafta.setCapacidadActual(0);
    }
    
    public void agragarCafe(int cafe, Cafetera cafta){
        if(cafta.getCapacidadActual() + cafe > cafta.getCapacidadMaxima()){
            cafta.setCapacidadActual(cafta.getCapacidadMaxima());
        }
        else{
            cafta.setCapacidadActual(cafta.getCapacidadActual() + cafe);
        }
    }
}