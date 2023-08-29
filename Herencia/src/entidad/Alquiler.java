/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.time.LocalDate;

/**
 *
 * @author Archer
 */
public class Alquiler {
    private String nombre;
    private int documento;
    private LocalDate fecha_alquiler;
    private LocalDate fecha_devolucion;
    private String posicion_amarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fecha_alquiler, LocalDate fecha_devolucion, String posicion_amarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.posicion_amarre = posicion_amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(LocalDate fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getPosicion_amarre() {
        return posicion_amarre;
    }

    public void setPosicion_amarre(String posicion_amarre) {
        this.posicion_amarre = posicion_amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
}
