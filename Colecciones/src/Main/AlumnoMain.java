/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.AlumnoService;

/**
 *
 * @author Archer
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        as.agregarAlumno();
        as.notaFinal();
    }
}
