/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.PaisService;

/**
 *
 * @author Archer
 */
public class PaisesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisService ps = new PaisService();
        ps.AgregarPaises();
    }
    
}
