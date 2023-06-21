/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Archer
 */
public class Persona2 {
    String nombre;
    Date fecha_nacimiento;

    public Persona2() {
    }

    public Persona2(String nombre, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona2{" + "nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
     
}
