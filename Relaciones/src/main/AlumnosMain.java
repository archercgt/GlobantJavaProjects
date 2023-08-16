/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Simulador;

/**
 *
 * @author Archer
 */
public class AlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        simulador.crearAlumnos(20);
        simulador.votacion();
        simulador.imprimirVotos();
        simulador.imprimirFacilitadores();
    }
    
}
