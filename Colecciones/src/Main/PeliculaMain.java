/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.PeliculaService;

/**
 *
 * @author Archer
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
       ps.agregarPeliculas();
    }
    
}
