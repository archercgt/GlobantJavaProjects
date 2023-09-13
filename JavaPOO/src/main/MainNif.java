/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.NIF;
import Servicio.NIFService;

/**
 *
 * @author Archer
 */
public class MainNif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService nif_servicio = new NIFService();
        NIF mi_nif = nif_servicio.crearNif();
        nif_servicio.mostrar(mi_nif);
    }
    
}
