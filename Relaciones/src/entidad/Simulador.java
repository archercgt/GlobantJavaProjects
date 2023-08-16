/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import utilidades.AlumnoComparadores;


/**
 *
 * @author Archer
 */
public class Simulador {
    private static Random random;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Voto> votos;

    public Simulador() {
        random = new Random();
        alumnos = new ArrayList();
        votos = new ArrayList();
    }
         
    public void crearAlumnos(int cant_alumnos){
        ArrayList<String> nombres_comp = crearNombres(cant_alumnos);
        ArrayList<Long> dnis = crearDnis(cant_alumnos);
        System.out.println("El listado de alumnos es el siguiente:");
        for(int i=0; i < cant_alumnos; i++){
            Alumno alumno = new Alumno(nombres_comp.get(i), dnis.get(i));
            alumnos.add(alumno);
            System.out.println(alumno);
        }
        System.out.println("");
    }
    
    public void votacion(){
        Alumno alumno_temp;
        int indice;
        for(Alumno alumno: alumnos){
            Voto voto = new Voto();
            voto.setAlumno(alumno);
            do{
                indice = random.nextInt(alumnos.size());
                alumno_temp = alumnos.get(indice);
                if(alumno != alumno_temp){
                    alumno_temp.setVotos(alumno_temp.getVotos() + 1);
                    voto.getAlumnos_votados().add(alumno_temp);
                }
            }while(voto.getAlumnos_votados().size() < 3);
            votos.add(voto);
        }
    }
    
    public void imprimirVotos(){
        System.out.println("A conitnución se presenta la lista de alumnos y los alumnos por los que votó");
        System.out.println("");
        for(Voto voto: votos){
            System.out.println("Alumno: " + voto.getAlumno().getNombre() + ", Votos: " + voto.getAlumno().getVotos());
            System.out.println("Y votó por los siguientes alumnos:");
            for(Alumno alumno: voto.getAlumnos_votados()){
                System.out.println(alumno.getNombre());
            }
            System.out.println("");
        }
    }
    
    public void imprimirFacilitadores(){
        Collections.sort(alumnos, AlumnoComparadores.ordenarVotosDesc);
        
        System.out.println("A continuación le listan los facilitadores:");
        for(int i=0; i<5; i++){
            System.out.println(alumnos.get(i).getNombre());
        }
        System.out.println("");
        System.out.println("A continuación le listan los facilitadores suplentes:");
        for(int i=5; i<10; i++){
            System.out.println(alumnos.get(i).getNombre());
        }
        System.out.println("");
    }
    
    public ArrayList<Long> crearDnis(int cant_alumnos){
        ArrayList<Long> dnis = new ArrayList();
        Long aleatorio;
        for (int i = 1; i <= cant_alumnos; i++){
            do{
                aleatorio = generarDniAleatorio();
            }while(dnis.contains(aleatorio));
            dnis.add(aleatorio);
        }
        return dnis;
    }
    
    public static long generarDniAleatorio() {
        long min = 100000000000000000L;  // Smallest 18-digit number
        long max = 999999999999999999L;  // Largest 18-digit number
        long range = max - min + 1;
        long scaled = (long) (random.nextDouble() * range);
        return scaled + min;
    }
    
    public ArrayList<String> crearNombres(int cant_alumnos){
        ArrayList<String> nombres_comp = new ArrayList();
        String nombre, apellido, completo;
        for(int i = 1; i <= cant_alumnos; i++){
            nombre = crearCadenaAleatoria();
            apellido = crearCadenaAleatoria();
            completo = nombre + " " + apellido;
            nombres_comp.add(completo);
        }
        return nombres_comp;
    }
    
    public static String crearCadenaAleatoria() {
        int nameLength = random.nextInt(5) + 5; // Generate a name length between 5 and 10 characters
        
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < nameLength; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
            nameBuilder.append(randomChar);
        }
        return nameBuilder.toString();
    }  
}
