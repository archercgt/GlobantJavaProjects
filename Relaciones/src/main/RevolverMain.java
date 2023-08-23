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
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class RevolverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int jugadores_usuario;
        ArrayList<Jugador> jugadores = new ArrayList();
        do{
            System.out.println("Ingrese una cantida de jugadores de 1 a 6");
            jugadores_usuario = leer.nextInt();
        }while(jugadores_usuario < 0 || jugadores_usuario > 6);
        
        for(int i=1; i <= jugadores_usuario; i++){
            jugadores.add(new Jugador(i, "Jugador" + String.valueOf(i), false));
        }
        
        System.out.println("Jugadores creados:");
        for(Jugador jugador: jugadores){
            System.out.println(jugador);
        }
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, r);
        
        while(!juego.ronda()){          
        }
    }
    
}
