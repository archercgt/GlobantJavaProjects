/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author Archer
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroService lib_servicio = new LibroService();
        Libro mi_libro = lib_servicio.cargarLibro();
        lib_servicio.mostrarLibro(mi_libro);
    }
}