/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Matematica;

/**
 *
 * @author Archer
 */
public class MainMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica mat = new Matematica();
        mat.setNum1(Math.random() * 10);
        mat.setNum2(Math.random() * 10);
        System.out.println("Los numeros creados son: " + mat.getNum1() + " y " + mat.getNum2());
        System.out.println(Math.round(mat.getNum1()) + " " + Math.round(mat.getNum2()));
        System.out.println("El mayor de los numeros es: " + mat.devolverMayor());
        System.out.println("La potencia es: " + mat.calcularPotencia());
        System.out.println("La raiz cuadrada es: " + mat.calculaRaiz());
        
    }
    
}
