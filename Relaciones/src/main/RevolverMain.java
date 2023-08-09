/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class RevolverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(new Jugador(1, "Jugador1", false));
        jugadores.add(new Jugador(2, "Jugador2", false));
        jugadores.add(new Jugador(3, "Jugador3", false));
        jugadores.add(new Jugador(4, "Jugador4", false));
        jugadores.add(new Jugador(5, "Jugador5", false));
        jugadores.add(new Jugador(6, "Jugador6", false));
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, r);
        
        juego.ronda();
    }
    
}
