/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class AutorServicio extends Servicio {

    public AutorServicio() {
    }

    public Autor consultar(Scanner scanner, EntityManager em) throws Exception {
        final String[] mensaje = {
            "Indique la opción según el parametro que desea utilizar para la búsqueda del autor;",
            "1. Buscar autor por ID",
            "2. Buscar autor por nombre"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        try {
            String opcion = validarInput(scanner);
            Autor autor = null;
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el ID del autor");
                    int id = Integer.parseInt(validarInput(scanner));
                    autor = (Autor) em.createQuery("SELECT a"
                            + " FROM Autor a"
                            + " WHERE a.id = :id").
                            setParameter("id", id).
                            getSingleResult();
                    break;
                case "2":
                    System.out.println("Ingrese el nombre del autor");
                    String nombre = validarInput(scanner);
                    autor = (Autor) em.createQuery("SELECT a"
                            + " FROM Autor a"
                            + " WHERE a.nombre = :nombre").
                            setParameter("nombre", nombre).
                            getSingleResult();
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
            return autor;
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (NoResultException e) {
            throw new Exception("Error: Autor no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    public void crear(Scanner scanner, EntityManager em) throws Exception {
        Autor autor = new Autor();
        try {
            System.out.println("Ingrese el nombre del autor a almacenar");
            String nombre = validarInput(scanner);
            autor.setNombre(nombre);
            autor.setAlta(true);
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            System.out.println("Autor almacenado exitosamente");
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Scanner scanner) {
    }

    public void eliminar(Scanner scanner) {
    }
}
