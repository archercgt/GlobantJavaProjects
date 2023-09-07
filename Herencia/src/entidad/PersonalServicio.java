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
public class PersonalServicio extends Empleado {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anio_incorporacion, int despacho, String nombre, String apellidos, String estado_civil, int id) {
        super(anio_incorporacion, despacho, nombre, apellidos, estado_civil, id);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladarSeccion() {
        System.out.println("Ingrese la nueva sección del personal de servicio");
        seccion = leer.next();
        System.out.println("Sección trasladada con éxito");
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estado_civil=" + estado_civil + ", id=" + id + ", anio_incorporacion=" + anio_incorporacion + ", despacho=" + despacho + ", seccion=" + seccion + '}';
    }
}
