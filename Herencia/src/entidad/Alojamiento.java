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
public abstract class Alojamiento {
    protected String nombre, direccion, localidad, gerente;
    protected Scanner leer;

    public Alojamiento() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public void crearAlojamiento(){
        System.out.println("Ingrese el nombre del establecimiento");
        nombre = leer.next();
        System.out.println("Ingrese una dirección");
        direccion = leer.next();
        System.out.println("Ingrese una localidad");
        localidad = leer.next();
        System.out.println("Ingrese el nombre del gerente");
        gerente = leer.next();
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + '}';
    }
    
    
    
}
