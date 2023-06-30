/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class PeliculaService {
    private List<Pelicula> peliculas = new ArrayList<>();

    public void PeliculaService() {
    }
   
    public void crearPelicula(){
        Scanner leer = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el nombre de la película");
        pelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el genero de la película");
        pelicula.setGenero(leer.nextLine());
        System.out.println("Ingrese el año de la película");
        pelicula.setAnio(leer.nextInt());
        System.out.println("Ingrese la duracion de la película");
        pelicula.setDuracion(leer.nextInt());
        peliculas.add(pelicula);
    }
    
    public boolean buscarTitulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el título de la película a buscar");
        String peliculaBuscar = leer.nextLine();
        for(Pelicula pelicula:peliculas){
            if(pelicula.getTitulo().equals(peliculaBuscar)){
                return true;
            }
        }
        return false;
    }

    public void buscarGenero(){
        Scanner leer = new Scanner(System.in);
        boolean existen = false;
        System.out.println("Ingrese el genero a buscar");
        String generoBuscar = leer.nextLine();
        System.out.println("El listado de películas del genero ingresado es: ");
        for(Pelicula pelicula:peliculas){
            if(pelicula.getGenero().equals(generoBuscar)){
                System.out.println(pelicula.getTitulo());
                existen = true;
            }
        }
        if(!existen)
            System.out.println("No se encontraron perlìculas del genero indicado");
        System.out.println("");
    } 
}