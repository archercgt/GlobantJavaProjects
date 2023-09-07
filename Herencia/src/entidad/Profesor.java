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
public class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anio_incorporacion, int despacho, String nombre, String apellidos, String estado_civil, int id) {
        super(anio_incorporacion, despacho, nombre, apellidos, estado_civil, id);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void cambiarDepartamento(){
        System.out.println("Ingrese el nuevo departamento del profesor");
        departamento = leer.next();
        System.out.println("Departamento cambiado con éxito");
    }

    
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estado_civil=" + estado_civil + ", id=" + id + ", anio_incorporacion=" + anio_incorporacion + ", despacho=" + despacho + ", departamento=" + departamento + '}';
    }
    
}
