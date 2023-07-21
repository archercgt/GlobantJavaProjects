/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.PeliculaComparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class PeliculaService {
    private ArrayList<Pelicula> peliculas;
    private Scanner leer;

    public PeliculaService() {
        peliculas = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el título de la película");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película en horas");
        pelicula.setDuracion(leer.nextDouble());
        return pelicula;
    }
    
    public void agregarPeliculas(){
        boolean continuar = true;
        while(continuar){
            peliculas.add(crearPelicula());
            System.out.println("Desea agreagar otra película? s/n");
            String opcion = leer.next();
            if(opcion.equals("n")){
                continuar = false;
                mostrarPeliculas();
                mostrarPeliculasMayorHora();
                ordernarDuracionAsc();
                ordernarDuracionDes();
                ordernarTitulo();
                ordernarDirector();
            }
        }
    }
    
    public void mostrarPeliculas(){
        System.out.println("El listado de películas es el siguiente:");
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
        System.out.println("");
    }
    
    public void mostrarPeliculasMayorHora(){
        System.out.println("Mostrar el listado de películas con duración mayor a 1 hora");
        peliculas.forEach((pelicula) -> {
            if(pelicula.getDuracion() > 1){
                System.out.println(pelicula);
            }
        });
        System.out.println("");
    }
    
    public void ordernarDuracionAsc(){
        Collections.sort(peliculas, PeliculaComparadores.ordenarDuracionAsc);
        System.out.println("Mostrar el listado de películas ordenadas por duracion de manera ascendente");
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
        System.out.println("");
    }
    
    public void ordernarDuracionDes(){
        Collections.sort(peliculas, PeliculaComparadores.ordenarDuracionDes);
        System.out.println("Mostrar el listado de películas ordenadas por duracion de manera descendente");
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
        System.out.println("");
    }
    
    public void ordernarTitulo(){
        Collections.sort(peliculas, PeliculaComparadores.ordenarTitulo);
        System.out.println("Mostrar el listado de películas ordenadas por título");
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
        System.out.println("");
    }

    public void ordernarDirector(){
        Collections.sort(peliculas, PeliculaComparadores.ordenarDuracionDes);
        System.out.println("Mostrar el listado de películas ordenadas por director");
        peliculas.forEach((pelicula) -> System.out.println(pelicula));
        System.out.println("");
    }
}
