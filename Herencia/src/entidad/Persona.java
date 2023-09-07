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
public abstract class Persona {
    protected String nombre, apellidos, estado_civil;
    protected int id;
    protected Scanner leer;

    public Persona() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Persona(String nombre, String apellidos, String estado_civil, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado_civil = estado_civil;
        this.id = id;
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void cambiarEstadoCivil(){
        System.out.println("Ingrese el nuevo estado civil");
        estado_civil = leer.next();
        System.out.println("Estado civil cambiado con éxito");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estado_civil=" + estado_civil + ", id=" + id + '}';
    }
    
}
