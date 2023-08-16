/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> alumnos_votados;

    public Voto() {
        alumnos_votados = new ArrayList();
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnos_votados) {
        this.alumno = alumno;
        this.alumnos_votados = alumnos_votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnos_votados() {
        return alumnos_votados;
    }

    public void setAlumnos_votados(ArrayList<Alumno> alumnos_votados) {
        this.alumnos_votados = alumnos_votados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnos_votados=" + alumnos_votados + '}';
    }
    
}
