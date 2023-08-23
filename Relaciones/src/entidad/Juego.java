/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public boolean ronda(){
        for(Jugador jugador: jugadores){
            if (jugador.disparo(r)){
                System.out.println("El jugador que se mojó es: " + jugador.getNombre());
                return true;
            }
            else{
                System.out.println("El jugador " + jugador.getNombre() + " se salvó");
            }
        }
        return false;
    }
}
