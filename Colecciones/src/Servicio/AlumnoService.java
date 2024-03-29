/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Archer
 */
public class AlumnoService {
    Scanner leer;
    ArrayList<Alumno> alumnos;

    public AlumnoService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        alumnos = new ArrayList();
    }
    
    public Alumno crearAlumno(){
        Alumno alumno = new Alumno();
        ArrayList<Double> notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(leer.next());
        for(int i = 1; i <= 3; i++){
            System.out.println("Ingrese la nota " + i);
            notas.add(new Double(leer.next()));
        }
        alumno.setNotas(notas);
        return alumno;
    }
    
    public void agregarAlumno(){
        boolean continuar = true;
        while(continuar){
            alumnos.add(crearAlumno());
            System.out.println("Desea crear otro alumno? s/n");
            String opcion = leer.next();
            if(opcion.equals("n")){
                continuar = false;
            }
        } 
    }
    
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String alumno_buscar = leer.next();
        Optional<Alumno> optionalAlumno = alumnos.stream()
                .filter(alumno -> alumno.getNombre().equals(alumno_buscar))
                .findFirst();
        if (optionalAlumno.isPresent()) {
            ArrayList<Double> notas = optionalAlumno.get().getNotas();
            Double suma = 0.0;
            for(Double nota: notas){
                suma += nota;
            }
            DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            String resultado = formatoDecimal.format(suma/notas.size());
            System.out.println("El promedio de las notas es: " + resultado);
        } else {
            System.out.println("El estudiante ingresado no se encontró");
        }
    }
}
