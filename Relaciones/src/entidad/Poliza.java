/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int num_poliza;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private ArrayList<Cuota> cuotas;
    private String forma_pago;
    private double monto_t_asegurado;
    private boolean granizo;
    private double monto_max_granizo;
    private String tipo_cobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, int num_poliza, LocalDate fecha_inicio, LocalDate fecha_fin, ArrayList<Cuota> cuotas, String forma_pago, double monto_t_asegurado, boolean granizo, double monto_max_granizo, String tipo_cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.num_poliza = num_poliza;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cuotas = cuotas;
        this.forma_pago = forma_pago;
        this.monto_t_asegurado = monto_t_asegurado;
        this.granizo = granizo;
        this.monto_max_granizo = monto_max_granizo;
        this.tipo_cobertura = tipo_cobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNum_poliza() {
        return num_poliza;
    }

    public void setNum_poliza(int num_poliza) {
        this.num_poliza = num_poliza;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public double getMonto_t_asegurado() {
        return monto_t_asegurado;
    }

    public void setMonto_t_asegurado(double monto_t_asegurado) {
        this.monto_t_asegurado = monto_t_asegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMonto_max_granizo() {
        return monto_max_granizo;
    }

    public void setMonto_max_granizo(double monto_max_granizo) {
        this.monto_max_granizo = monto_max_granizo;
    }

    public String getTipo_cobertura() {
        return tipo_cobertura;
    }

    public void setTipo_cobertura(String tipo_cobertura) {
        this.tipo_cobertura = tipo_cobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", num_poliza=" + num_poliza + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", cuotas=" + cuotas + ", forma_pago=" + forma_pago + ", monto_t_asegurado=" + monto_t_asegurado + ", granizo=" + granizo + ", monto_max_granizo=" + monto_max_granizo + ", tipo_cobertura=" + tipo_cobertura + '}';
    }
    
}
