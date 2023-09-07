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
public abstract class Hotel extends Alojamiento{
    protected int cantidad_habitaciones, num_camas, pisos;
    protected double precio_habitacion;

    public Hotel() {
    }

    public Hotel(int cantidad_habitaciones, int num_camas, int pisos, double precio_habitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.num_camas = num_camas;
        this.pisos = pisos;
        this.precio_habitacion = precio_habitacion;
    }

    public int getCantidad_habitaciones() {
        return cantidad_habitaciones;
    }

    public void setCantidad_habitaciones(int cantidad_habitaciones) {
        this.cantidad_habitaciones = cantidad_habitaciones;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }
    
    
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de habitaciones");
        cantidad_habitaciones = leer.nextInt();
        System.out.println("Ingrese el numero de camas");
        num_camas = leer.nextInt();
        System.out.println("Ingrees el numero de pisos");
        pisos = leer.nextInt();
    }
    
    public abstract void calcularPrecioHabitacion();
}
