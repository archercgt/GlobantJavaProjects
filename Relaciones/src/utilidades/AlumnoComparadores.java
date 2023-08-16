/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author Archer
 */
public class AlumnoComparadores {
    public static Comparator<Alumno> ordenarVotosDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return Integer.valueOf(t1.getVotos()).compareTo(t.getVotos());
        }
    };
}
