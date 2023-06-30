/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Entidad.Alquiler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class AlquilerService {
    private List<Alquiler> alquileres = new ArrayList<>();
    private PeliculaService ps = new PeliculaService();

    public AlquilerService() {
    }
    
    public AlquilerService(PeliculaService ps) {
        this.ps = ps;
    }
    
    public void crearAlquiler(Scanner leer){
        System.out.println("Ingrese el nombre de la película a alquilar");
        String pelicula_alquiler = leer.nextLine();
        Pelicula pelicula = buscarPelicula(pelicula_alquiler);
        if(pelicula == null){
            System.out.println("Lo sentimos, la película que desea alquilar no está disponible.");
            System.out.println("");
        }
        else{
            LocalDate fechaInicial = LocalDate.now(); 
            System.out.println("Ingrese la cantidad de días que va a alquilar la película");
            int diasAlquiler = leer.nextInt();
            double precio = calcularCosto(diasAlquiler);
            LocalDate fechaFinal = fechaInicial.plusDays(diasAlquiler);
            Alquiler Alquiler = new Alquiler(pelicula, fechaInicial, fechaFinal, precio);
            alquileres.add(Alquiler);
        }  
    }
    
    public Pelicula buscarPelicula(String pelicula_alquiler){
        for(Pelicula pelicula: ps.getPeliculas()){
            if(pelicula.getTitulo().equals(pelicula_alquiler)){
                return pelicula;
            }
        }
        return null;
    }
    
    private static double calcularCosto(int dias){
        double precio = 10;
        if (dias <= 3){
            return precio;
        }
        else{
            for(int i = 0; i < (dias-3); i++){
                precio += (precio * 0.1);
            }
            return precio;
        }
    }
    
    public void listarAlquileres(){
        System.out.println("Los alquileres realizados hasta el momento son los siguientes: ");
        for(Alquiler alquiler:alquileres){
            System.out.println(alquiler);
        }
        System.out.println("");
    }
    
    public void alquilerFecha(Scanner leer){
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        List<Alquiler> alquileresFecha = new ArrayList<>();
        for(Alquiler alquiler: alquileres){
            if(fecha.compareTo(alquiler.getFechaInicio())== 0){
                alquileresFecha.add(alquiler);
            }
        }
        if(alquileresFecha.isEmpty()){
            System.out.println("No existen alquileres para la fecha ingresada");
            System.out.println("");
        }
        else{
            System.out.println("A continuación se presentan los alquileres para la fecha indicada:");
            for(Alquiler alquiler: alquileresFecha){
                System.out.println(alquiler);
            }
            System.out.println("");
        }
    }
}
