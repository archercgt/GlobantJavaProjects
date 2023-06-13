/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class OperacionServicio {
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion opcn = new Operacion();
        System.out.println("Ingrese el numero 1");
        opcn.setNumero1(leer.nextInt());
        System.out.println("Ingrese el numero 2");
        opcn.setNumero2(leer.nextInt());
        return opcn;
    }
    
    public int sumar(Operacion opcn){
        return opcn.getNumero1() + opcn.getNumero2();
    }
    public int restar(Operacion opcn){
        return opcn.getNumero1() - opcn.getNumero2();
    }
    public int multiplicar(Operacion opcn){
        return opcn.getNumero1() * opcn.getNumero2();
    }
    public int dividir(Operacion opcn){
        if(opcn.getNumero2() == 0){
            System.out.println("No es posible la división por cero");
            return 0;
        }
        else {
            return opcn.getNumero1() / opcn.getNumero2();
        }
    }
}