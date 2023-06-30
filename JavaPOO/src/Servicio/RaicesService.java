/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class RaicesService {

    public RaicesService() {
    }
    
    public Raices crearRaices(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de a");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de a");
        double c = leer.nextDouble();
        Raices mis_raices = new Raices(a, b, c);
        leer.close();
        return mis_raices;
    }
    
    public double getDiscriminante(Raices mis_raices){
        double discriminante = Math.pow(mis_raices.getB(), 2) - 4 * mis_raices.getA() * mis_raices.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(double discriminante){
        if (discriminante > 0){
            return true;
        }
        else
            return false;
    }
    
    public boolean tieneRaiz(double discriminante){
        if (discriminante == 0){
            return true;
        }
        else
            return false;
    }
    
    public void obtenerRaices(double discriminante, Raices mis_raices){
        if (tieneRaices(discriminante)){
            double a = mis_raices.getA();
            double b = mis_raices.getB();
            double c = mis_raices.getC();
            double sol1 = (-b+Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
            double sol2 = (-b-Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
            System.out.println("La primera solucion es: " + sol1);
            System.out.println("La segunda solucion es: " + sol2);
        }
    }
    
    public void obtenerRaiz(double discriminante, Raices mis_raices){
        if (tieneRaiz(discriminante)){
            double a = mis_raices.getA();
            double b = mis_raices.getB();
            double sol = (-b)/2*a;
            System.out.println("La solcioón es: " + sol);
        }
    }
    
    public void calcular(double discriminante, Raices mis_raices){
        if(tieneRaices(discriminante)){
            obtenerRaices(discriminante, mis_raices);
        }
        else if (tieneRaiz(discriminante)){
            obtenerRaiz(discriminante, mis_raices);
        }
        else
            System.out.println("La ecuación no tiene solución");
    }
}