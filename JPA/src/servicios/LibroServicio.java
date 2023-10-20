/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author Archer
 */
public class LibroServicio extends Servicio{

    public LibroServicio() {
    }

    public void consultar(Scanner scanner, EntityManager em) throws Exception{
        
    }

    public void crear(Scanner scanner, EntityManager em) throws Exception{
        Libro libro = new Libro();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        Autor autor = null;
        Editorial editorial = null;
        try {
            System.out.println("Ingrese el ISBN del libro a almacenar");
            Long isbn = Long.parseLong(validarInput(scanner));
            libro.setIsbn(isbn);
            System.out.println("Ingrese el título del libro a almacenar");
            String titulo = validarInput(scanner);
            libro.setTitulo(titulo);
            System.out.println("Ingrese el año de publicación del libro a almacenar");
            int anio = Integer.parseInt(validarInput(scanner));
            libro.setAnio(anio);
            System.out.println("Ingrese la cantidad de ejemplares del libro a almacenar");
            int ejemplares = Integer.parseInt(validarInput(scanner));
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            libro.setAlta(true);
            System.out.println("A continuación se solicitará la información del autor para asignar al libro");
            autor = as.consultar(scanner, em);
            editorial = es.consultar(scanner, em);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.println("Libro almacenado exitosamente");
            System.out.println("");
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (Exception e){
            throw e;
        }
        
    }

    public void modificar(Scanner scanner) {
       
    }

    public void eliminar(Scanner scanner) {
        
    }
}
