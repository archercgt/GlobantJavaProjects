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
public abstract class Empleado extends Persona{
    protected int anio_incorporacion, despacho;

    public Empleado() {
    }

    public Empleado(int anio_incorporacion, int despacho, String nombre, String apellidos, String estado_civil, int id) {
        super(nombre, apellidos, estado_civil, id);
        this.anio_incorporacion = anio_incorporacion;
        this.despacho = despacho;
    }

    public int getAnio_incorporacion() {
        return anio_incorporacion;
    }

    public void setAnio_incorporacion(int anio_incorporacion) {
        this.anio_incorporacion = anio_incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
    
    public void reasignarDespacho(){
        System.out.println("Ingrese el nuevo despacho del empleado");
        despacho = leer.nextInt();
        System.out.println("Despacho reasignado con éxito");
    }


    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estado_civil=" + estado_civil + ", id=" + id + ", anio_incorporacion=" + anio_incorporacion + ", despacho=" + despacho + '}';
    }
    
    
}
