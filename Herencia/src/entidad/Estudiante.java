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
public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellidos, String estado_civil, int id) {
        super(nombre, apellidos, estado_civil, id);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void matricularNuevoCurso(){
        System.out.println("Ingrese el nuevo curso al que quiere matricular el estudiante");
        curso = leer.next();
        System.out.println("Curso matriculado con éxito");
    }


    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", estado_civil=" + estado_civil + ", id=" + id + ", curso=" + curso + '}';
    }
    
}
