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
import javax.persistence.NoResultException;
import persistencia.AutorDAO;
import persistencia.EditorialDAO;
import persistencia.LibroDAO;

/**
 *
 * @author Archer
 */
public class LibroServicio extends Servicio {

    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    LibroDAO libroDAO = new LibroDAO();
    AutorDAO autorDAO = new AutorDAO();
    EditorialDAO editorialDAO = new EditorialDAO();

    @Override
    public void crear(Scanner scanner) throws Exception {
        Libro libro = new Libro();
        Autor autor = null;
        Editorial editorial = null;
        try {
            System.out.println("Ingrese el ISBN del libro a almacenar");
            Long isbn = Long.parseLong(validarInput(scanner));
            libro.setIsbn(isbn);
            System.out.println("Ingrese el título del libro a almacenar");
            String titulo = validarInput(scanner);
            if (libroDAO.validarLibro(titulo)) {
                throw new Exception("Error: El libro ya existe");
            }
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
            System.out.println("Ingrese el ID del autor que se asignará al libro");
            int id = Integer.valueOf(validarInput(scanner));
            autor = autorDAO.consultarPorId(id);
            System.out.println("Ingrese el ID de la editorial que se asignará al libro");
            id = Integer.valueOf(validarInput(scanner));
            editorial = editorialDAO.consultarPorId(id);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libroDAO.guardar(libro);
            System.out.println("Libro almacenado exitosamente");
            System.out.println("");
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void consultar(Scanner scanner) throws Exception {
        final String[] mensaje = {
            "Indique la opción según el parametro que desea utilizar para la búsqueda del libro;",
            "1. Buscar libro por ISBN",
            "2. Buscar libro por título",
            "3. Buscar libros por autor",
            "4. Buscar libors por editorial",
            ""
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        try {
            String opcion = validarInput(scanner);
            Libro libro = null;
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el ISBN del libro");
                    Long isbn = Long.parseLong(validarInput(scanner));
                    System.out.println(libroDAO.buscarPorIsbn(isbn));
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("Ingrese el título del libro");
                    String titulo = validarInput(scanner);
                    System.out.println(libroDAO.buscarPorTitulo(titulo));
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Ingrese el autor de los libros");
                    String autor = validarInput(scanner);
                    libroDAO.buscarPorAutor(autor);
                    break;
                case "4":
                    System.out.println("Ingrese la editorial de los libros");
                    String editorial = validarInput(scanner);
                    libroDAO.buscarPorEditorial(editorial);
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (NoResultException e) {
            throw new Exception("Error: Libro no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    @Override
    public void modificar(Scanner scanner) throws Exception {
        System.out.println("Ingrese el ISBN del libro que desea editar");
        Long isbn = Long.parseLong(validarInput(scanner));
        Libro libro = libroDAO.buscarPorIsbn(isbn);
        final String[] mensaje = {
            "Indique la opción según la modificación que desee hace sobre la editorial;",
            "1. Dar de alta/baja",
            "2. Modificar el título",
            "3. Modificar la cantidad de ejemplares",
            "4. Modificar el año",
            "5. Modificar el autor",
            "6. Modificar la editorial"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Seleccione según desee dar de alta o de baja el libro");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                String opcion2 = validarInput(scanner);
                switch (opcion2) {
                    case "1":
                        libro.setAlta(true);
                        break;
                    case "2":
                        libro.setAlta(false);
                        break;
                }
                break;
            case "2":
                System.out.println("Ingrese el nuevo título que tendrá el libro");
                String titulo = validarInput(scanner);
                libro.setTitulo(titulo);
                break;
            case "3":
                System.out.println("Ingrese la nueva cantidad de ejemplares");
                int ejemplares = Integer.parseInt(validarInput(scanner));
                libro.setEjemplares(ejemplares);
                break;
            case "4":
                System.out.println("Ingrese el nuevo año");
                int anio = Integer.parseInt(validarInput(scanner));
                libro.setEjemplares(anio);
                break;
            case "5":
                System.out.println("Ingrese el ID del nuevo autor");
                int id = Integer.parseInt(validarInput(scanner));
                libro.setAutor(autorDAO.consultarPorId(id));
                break;
            case "6":
                System.out.println("Ingrese el ID de la nueva editorial");
                id = Integer.parseInt(validarInput(scanner));
                libro.setEditorial(editorialDAO.consultarPorId(id));
                break;
            default:
                System.out.println("La opción ingresada es invalida");
        }
        libroDAO.editar(libro);
        System.out.println("Libro modificado con éxito");
        System.out.println("");
    }

    public void eliminar(Scanner scanner) {

    }
}
