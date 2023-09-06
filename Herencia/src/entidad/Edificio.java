/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public abstract class Edificio {
    protected int ancho, alto, largo;
    protected Scanner leer;

    public Edificio() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public void calcularSueprficie(){
        System.out.println("La superficie del edificio es: " + (ancho * largo) + " metros cuadrados." );
    }
    
    public abstract void calcularVolumen();
    
    public void crearEdificio(){
        System.out.println("Ingrese el ancho en metros");
        ancho = leer.nextInt();
        System.out.println("Ingrese el alto en metros");
        alto = leer.nextInt();
        System.out.println("Ingrese el largo");
        largo = leer.nextInt();
    }
}
