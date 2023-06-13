/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class LibroService {
    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in);
        Libro lib = new Libro();
        System.out.println("Ingrese el ISBN");
        lib.setIsbn(leer.nextLine());
        System.out.println("Ingrese el Título");
        lib.setTitulo(leer.nextLine());
        System.out.println("Ingrese el Autor");
        lib.setAutor(leer.nextLine());
        System.out.println("Ingrese el número de páginas");
        lib.setNum_paginas(leer.nextInt());
        leer.close();
        return lib;
    }
    
    public void mostrarLibro(Libro lib){
        System.out.println("El ISBN es: " + lib.getIsbn());
        System.out.println("El título es: " + lib.getTitulo());
        System.out.println("El autor es: " + lib.getAutor());
        System.out.println("El número de páginas es: " + lib.getNum_paginas());
    }
}