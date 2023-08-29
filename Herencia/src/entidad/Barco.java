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
public class Barco {
    protected String matricula;
    protected double eslora;
    protected int anio_fabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anio_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
    }
    
}
