/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

/**
 *
 * @author Archer
 */
public class MainCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaService cir_servicio = new CircunferenciaService();
        Circunferencia circ = cir_servicio.crearCircunferencia(3);
        cir_servicio.area(circ);
        cir_servicio.perimetro(circ);
    }
    
}
