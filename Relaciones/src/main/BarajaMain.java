/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Baraja;

/**
 *
 * @author Archer
 */
public class BarajaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        baraja.siguienteCarta();
        baraja.cartasDisponibles();
        baraja.darCartas(3);
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
    
}
