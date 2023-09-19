/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Armadura;

/**
 *
 * @author Archer
 */
public class ArmaduraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Armadura armadura = new Armadura();
        armadura.setColor_primario("rojo");
        armadura.setColor_secundario("amarillo");
        armadura.setNivel_resistencia(60);
        armadura.setNivel_salud(100);
        armadura.mostrarEstado();
        armadura.mostrarEstadoBateria();
        armadura.caminar(60);
        armadura.correr(60);
        armadura.propulsar(60);
        armadura.volar(60);
        armadura.escribir(60);
        armadura.leer(60);
        armadura.mostrarEstadoBateria();
    }
    
}
