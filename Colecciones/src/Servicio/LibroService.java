/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class LibroService {
    private HashSet<Libro> libros;
    private Scanner leer;

    public LibroService() {
       libros = new HashSet();
       leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarLibro(){
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese el titulo del libro");
            String titulo = leer.next();
            System.out.println("Ingrese el autor del libro");
            String autor = leer.next();
            System.out.println("Ingrese el número de ejemplares disponibles");
            int ejemplares = leer.nextInt();
            libros.add(new Libro(titulo, autor, ejemplares, 0));
            System.out.println("Desea agregar otro libro s/n");
            String opcion = leer.next();
            if(opcion.equals("n")){
                continuar = false;
            }
        }
    }
    
    public void prestamo(){
        boolean prestado = false;
        System.out.println("ingrese el título del libro que desea prestar");
        String titulo = leer.next();
        for (Libro libro: libros){
            if(libro.getTitulo().equals(titulo) && libro.getEjemplares() > 0){
                libro.setEjemplares(libro.getEjemplares() - 1);
                libro.setPrestados(libro.getPrestados() + 1);
                prestado = true;
                break;
            }
        }
        if(prestado){
            System.out.println("Se realizó el prestamó correctamente");
            System.out.println("");
        }else{
            System.out.println("El título ingresado no se encontró");
            System.out.println("");
        }
    }
    
    public void devolución(){
        boolean devuelto = false;
        System.out.println("ingrese el título del libro que desea devolver");
        String titulo = leer.next();
        for (Libro libro: libros){
            if(libro.getTitulo().equals(titulo) && libro.getPrestados() > 0){
                libro.setEjemplares(libro.getEjemplares() + 1);
                libro.setPrestados(libro.getPrestados() - 1);
                devuelto = true;
                break;
            }
        }
        if(devuelto){
            System.out.println("Se realizó la devolución correctamente");
            System.out.println("");
        }else{
            System.out.println("El título ingresado no se encontró");
            System.out.println("");
        }
    }
}
