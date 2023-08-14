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
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int num_motor;
    private int num_chasis;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int num_motor, int num_chasis, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.num_motor = num_motor;
        this.num_chasis = num_chasis;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(int num_motor) {
        this.num_motor = num_motor;
    }

    public int getNum_chasis() {
        return num_chasis;
    }

    public void setNum_chasis(int num_chasis) {
        this.num_chasis = num_chasis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", num_motor=" + num_motor + ", num_chasis=" + num_chasis + ", tipo=" + tipo + '}';
    }
   
}
