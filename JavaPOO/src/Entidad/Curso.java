/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Curso {
    private String nombreCurso, turno;
    private int cantidadHorasPorDia, cantidadDiasPorSemana;
    private double precioPorHora;
    private String [] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumno(String[] alumno) {
        this.alumnos = alumno;
    }  
    
    public void cargarAlumnos(){
        Scanner leer = new Scanner(System.in);
        String[] arregloAlumnos = new String[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            arregloAlumnos[i] = leer.nextLine();
        }
        this.alumnos = arregloAlumnos; 
    }
    
    public void crearCurso(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso");
        this.nombreCurso = leer.nextLine();
        System.out.println("Ingrese el turno: mañana/tarde");
        this.turno = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        this.cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana");
        this.cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el precio por hora");
        this.precioPorHora = leer.nextDouble();
        this.cargarAlumnos();
    }
    
    public void calcularGananciaSemanal(){
        double ganancias = this.cantidadDiasPorSemana * this.cantidadHorasPorDia * this.precioPorHora * 5;
        System.out.println("La ganancia del curso es: $" + ganancias);
    }
    
}