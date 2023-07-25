/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.LibroService;

/**
 *
 * @author Archer
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        ls.agregarLibro();
        ls.prestamo();
        ls.devolución();
    }
}
