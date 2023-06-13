/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;

/**
 *
 * @author Archer
 */
public class CircunferenciaService {
    public Circunferencia crearCircunferencia(double radio){
        Circunferencia circ = new Circunferencia(radio);
        return circ;
    }
    
    public double area(Circunferencia circ){
        return Math.pow(circ.getRadio(), 2) * Math.PI;
    }
    
    public double perimetro(Circunferencia circ){
        return 2 * Math.PI * circ.getRadio();
    }
}