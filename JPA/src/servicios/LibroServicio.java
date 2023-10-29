/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class LibroServicio extends Servicio {
//
//    public LibroServicio() {
//    }
//
//    public Libro consultar(Scanner scanner, EntityManager em) throws Exception {
//        final String[] mensaje = {
//            "Indique la opción según el parametro que desea utilizar para la búsqueda del libro;",
//            "1. Buscar libro por ISBN",
//            "2. Buscar libro por título"
//        };
//        for (String line : mensaje) {
//            System.out.println(line);
//        }
//        try {
//            String opcion = validarInput(scanner);
//            Libro libro = null;
//            switch (opcion) {
//                case "1":
//                    System.out.println("Ingrese el ISBN del libro");
//                    Long isbn = Long.parseLong(validarInput(scanner));
//                    libro = (Libro) em.createQuery("SELECT l"
//                            + " FROM Libro l"
//                            + " WHERE l.isbn = :id").
//                            setParameter("id", isbn).
//                            getSingleResult();
//                    break;
//                case "2":
//                    System.out.println("Ingrese el nombre del libro");
//                    String titulo = validarInput(scanner);
//                    libro = (Libro) em.createQuery("SELECT l"
//                            + " FROM Libro l"
//                            + " WHERE l.titulo = :titulo").
//                            setParameter("titulo", titulo).
//                            getSingleResult();
//                    break;
//                default:
//                    System.out.println("La opción ingresada no es valida.");
//            }
//            return libro;
//        } catch (NumberFormatException e) {
//            throw new Exception("Error: El valor ingresado debe ser un número!!!");
//        } catch (NoResultException e) {
//            throw new Exception("Error: Libro no encontrado!!!");
//        } catch (Exception e) {
//            throw new Exception("Error durante la consulta");
//        }
//    }
//
//    public Collection<Libro> consultarLibros(Scanner scanner, EntityManager em) throws Exception {
//        final String[] mensaje = {
//            "Indique la opción según el parametro que desea utilizar para la búsqueda de los libros;",
//            "1. Buscar libros por autor",
//            "2. Buscar libros por editorial"
//        };
//        for (String line : mensaje) {
//            System.out.println(line);
//        }
//        try {
//            String opcion = validarInput(scanner);
//            String nombre;
//            Collection<Libro> libros = null;
//            switch (opcion) {
//                case "1":
//                    System.out.println("Ingrese el nombre del autor");
//                    nombre = validarInput(scanner);
//                    libros = em.createQuery("SELECT l"
//                            + " FROM Libro l"
//                            + " JOIN l.autor a"
//                            + " WHERE a.nombre = :nombre").
//                            setParameter("nombre", nombre).
//                            getResultList();
//                    break;
//                case "2":
//                    System.out.println("Ingrese el nombre de la editorial");
//                    nombre = validarInput(scanner);
//                    libros = em.createQuery("SELECT l"
//                            + " FROM Libro l"
//                            + " JOIN l.editorial e"
//                            + " WHERE e.nombre = :nombre").
//                            setParameter("nombre", nombre).
//                            getResultList();
//                    break;
//                default:
//                    System.out.println("La opción ingresada no es valida.");
//            }
//            return libros;
//        } catch (NumberFormatException e) {
//            throw new Exception("Error: El valor ingresado debe ser un número!!!");
//        } catch (NoResultException e) {
//            throw new Exception("Error: No se encontraron libros!!!");
//        } catch (Exception e) {
//            throw new Exception("Error durante la consulta");
//        }
//    }
//
//    public void crear(Scanner scanner, EntityManager em) throws Exception {
//        Libro libro = new Libro();
//        AutorServicio as = new AutorServicio();
//        EditorialServicio es = new EditorialServicio();
//        Autor autor = null;
//        Editorial editorial = null;
//        try {
//            System.out.println("Ingrese el ISBN del libro a almacenar");
//            Long isbn = Long.parseLong(validarInput(scanner));
//            libro.setIsbn(isbn);
//            System.out.println("Ingrese el título del libro a almacenar");
//            String titulo = validarInput(scanner);
//            if (validarLibro(titulo, em) != null) {
//                throw new Exception("Error: El libro ya existe");
//            }
//            libro.setTitulo(titulo);
//            System.out.println("Ingrese el año de publicación del libro a almacenar");
//            int anio = Integer.parseInt(validarInput(scanner));
//            libro.setAnio(anio);
//            System.out.println("Ingrese la cantidad de ejemplares del libro a almacenar");
//            int ejemplares = Integer.parseInt(validarInput(scanner));
//            libro.setEjemplares(ejemplares);
//            libro.setEjemplaresPrestados(0);
//            libro.setEjemplaresRestantes(ejemplares);
//            libro.setAlta(true);
//            System.out.println("A continuación se solicitará la información del autor para asignar al libro");
//            //autor = as.consultar(scanner, em);
//            editorial = es.consultar(scanner, em);
//            libro.setAutor(autor);
//            libro.setEditorial(editorial);
//            em.getTransaction().begin();
//            em.persist(libro);
//            em.getTransaction().commit();
//            System.out.println("Libro almacenado exitosamente");
//            System.out.println("");
//        } catch (NumberFormatException e) {
//            throw new Exception("Error: El valor ingresado debe ser un número!!!");
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    public void modificar(Scanner scanner, EntityManager em) throws Exception {
//        Libro libro = consultar(scanner, em);
//        final String[] mensaje = {
//            "Indique la opción según la modificación que desee hace sobre la editorial;",
//            "1. Dar de alta/baja",
//            "2. Modificar el título",
//            "3. Modificar la cantidad de ejemplares",
//            "4. Modificar el año",
//            "5. Modificar el autor",
//            "6. Modificar la editorial"
//        };
//        for (String line : mensaje) {
//            System.out.println(line);
//        }
//        String opcion = validarInput(scanner);
//        switch (opcion) {
//            case "1":
//                System.out.println("Seleccione según desee dar de alta o de baja el libro");
//                System.out.println("1. Alta");
//                System.out.println("2. Baja");
//                String opcion2 = validarInput(scanner);
//                switch (opcion2) {
//                    case "1":
//                        libro.setAlta(true);
//                        break;
//                    case "2":
//                        libro.setAlta(false);
//                        break;
//                }
//                break;
//            case "2":
//                System.out.println("Ingrese el nuevo título que tendrá el libro");
//                String titulo = validarInput(scanner);
//                libro.setTitulo(titulo);
//                break;
//            case "3":
//                System.out.println("Ingrese la nueva cantidad de ejemplares");
//                int ejemplares = Integer.parseInt(validarInput(scanner));
//                libro.setEjemplares(ejemplares);
//                break;
//            case "4":
//                System.out.println("Ingrese el nuevo año");
//                int anio = Integer.parseInt(validarInput(scanner));
//                libro.setEjemplares(anio);
//                break;
//            case "5":
//                AutorServicio as = new AutorServicio();
//                Autor autor = as.consultar(scanner, em);
//                libro.setAutor(autor);
//                break;
//            case "6":
//                EditorialServicio es = new EditorialServicio();
//                Editorial editorial = es.consultar(scanner, em);
//                libro.setEditorial(editorial);
//                break;
//            default:
//                System.out.println("La opción ingresada es invalida");
//        }
//        em.getTransaction().begin();
//        em.merge(libro);
//        em.getTransaction().commit();
//        System.out.println("Libro modificado con éxito");
//        System.out.println("");
//    }
//
//    public void eliminar(Scanner scanner) {
//
//    }
//
//    public Libro validarLibro(String titulo, EntityManager em) {
//        try {
//            Libro libro = (Libro) em.createQuery("SELECT l"
//                    + " FROM Libro l"
//                    + " WHERE l.titulo = :titulo").
//                    setParameter("titulo", titulo).
//                    getSingleResult();
//            return libro;
//        } catch (Exception e) {
//            return null;
//        }
//    }
}
