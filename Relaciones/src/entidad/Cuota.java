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
public class Cuota {
    private int num_cuota;
    private double monto_tot_cuota;
    private boolean pagada;
    private LocalDate fecha_vencimiento;
    private String forma_pago;

    public Cuota() {
    }

    public Cuota(int num_cuota, double monto_tot_cuota, boolean pagada, LocalDate fecha_vencimiento, String forma_pago) {
        this.num_cuota = num_cuota;
        this.monto_tot_cuota = monto_tot_cuota;
        this.pagada = pagada;
        this.fecha_vencimiento = fecha_vencimiento;
        this.forma_pago = forma_pago;
    }

    public int getNum_cuota() {
        return num_cuota;
    }

    public void setNum_cuota(int num_cuota) {
        this.num_cuota = num_cuota;
    }

    public double getMonto_tot_cuota() {
        return monto_tot_cuota;
    }

    public void setMonto_tot_cuota(double monto_tot_cuota) {
        this.monto_tot_cuota = monto_tot_cuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "num_cuota=" + num_cuota + ", monto_tot_cuota=" + monto_tot_cuota + ", pagada=" + pagada + ", fecha_vencimiento=" + fecha_vencimiento + ", forma_pago=" + forma_pago + '}';
    }
    
}
