/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author Archer
 */
public class MainOperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionServicio ope_servicio = new OperacionServicio();
        Operacion ope = ope_servicio.crearOperacion();
        System.out.println("La suma de los numeros es: " + ope_servicio.sumar(ope));
        System.out.println("La resta de los numeros es: " + ope_servicio.restar(ope));
        System.out.println("La multiplicacion de los numeros es: " + ope_servicio.dividir(ope));
        System.out.println("La division de los numeros es " + ope_servicio.dividir(ope));
    }
}