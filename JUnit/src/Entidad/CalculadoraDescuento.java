/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Archer
 */
public class CalculadoraDescuento {
    private double precioProducto;
    private int descuento;

    public CalculadoraDescuento() {
    }

    public CalculadoraDescuento(double precioProducto, int descuento) {
        this.precioProducto = precioProducto;
        this.descuento = descuento;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
