/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enumeracion.Numero;
import enumeracion.Palo;

/**
 *
 * @author Archer
 */
public class Carta {
    private Numero numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
