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
public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldo_actual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldo_actual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo_actual = saldo_actual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo_actual=" + saldo_actual + '}';
    }
}