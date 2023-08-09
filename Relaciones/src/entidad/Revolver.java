/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Random;

/**
 *
 * @author Archer
 */
public class Revolver {
    private int posicion_actual;
    private int posicion_agua;

    public Revolver() {
    }

    public Revolver(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }
    
    public void llenarRevolver(){
        Random random = new Random();
        posicion_actual = random.nextInt(6) + 1;
        posicion_agua = random.nextInt(6) + 1;
    }
    
    public boolean mojar(){
        if (posicion_actual == posicion_agua)
            return true;
        else
            return false;
    }
    
    public void siguienteChorro(){
        if (posicion_actual < 6){
            posicion_actual += 1;
        }
        else
            posicion_actual = 1;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

}
