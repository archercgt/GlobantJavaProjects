/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Raices;
import Servicio.RaicesService;

/**
 *
 * @author Archer
 */
public class MainRaices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesService raices_servicio = new RaicesService();
        Raices mis_raices = raices_servicio.crearRaices();
        double discriminante = raices_servicio.getDiscriminante(mis_raices);
        raices_servicio.calcular(discriminante, mis_raices);
    }
}
