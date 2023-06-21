/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Curso;

/**
 *
 * @author Archer
 */
public class MainCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso_prueba = new Curso();
        curso_prueba.crearCurso();
        curso_prueba.calcularGananciaSemanal();
    } 
}