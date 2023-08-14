/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cine;
import entidad.Pelicula;

/**
 *
 * @author Archer
 */
public class CineMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cine cine = new Cine();
        cine.crearEspectadores();
        Pelicula pelicula = new Pelicula("Titanic", 269, 16, "James Cameron");
        cine.setPelicula(pelicula);
        cine.crearSala();
        cine.ubicarEspectadores();
        cine.imprimirSala();
    }
    
}
