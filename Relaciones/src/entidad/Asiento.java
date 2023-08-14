/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


/**
 *
 * @author Archer
 */
public class Asiento {
    private int fila;
    private String columna;
    private String estado;

    public Asiento() {
    }

    public Asiento(int fila, String columna, String estado) {
        this.fila = fila;
        this.columna = columna;
        this.estado = estado;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", columna=" + columna + ", estado=" + estado + '}';
    }
    
}
