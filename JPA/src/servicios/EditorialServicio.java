/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class EditorialServicio extends Servicio{

    public EditorialServicio() {
    }

    @Override
    public void consultar(Scanner scanner, EntityManager em) throws Exception{
        final String[] mensaje = {
            "Indique la opción según el parametro que desea utilizar para la búsqueda de la editorial;",
            "1. Buscar editorial por ID",
            "2. Buscar editorial por nombre"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        try {
            String opcion = validarInput(scanner);
            Editorial editorial = null;
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el ID de la editorial");
                    int id = Integer.parseInt(validarInput(scanner));
                    editorial = (Editorial) em.createQuery("SELECT e"
                            + " FROM Editorial e"
                            + " WHERE e.id = :id").
                            setParameter("id", id).
                            getSingleResult();
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la editorial");
                    String nombre = validarInput(scanner);
                    editorial = (Editorial) em.createQuery("SELECT e"
                            + " FROM Editorial e"
                            + " WHERE e.nombre = :nombre").
                            setParameter("nombre", nombre).
                            getSingleResult();
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
            System.out.println(editorial);
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (NoResultException e) {
            throw new Exception("Error: Editorial no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    @Override
    public void crear(Scanner scanner, EntityManager em) {
        Editorial editorial = new Editorial();
        try {
            System.out.println("Ingrese el nombre de la editorial a almacenar");
            String nombre = validarInput(scanner);
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            System.out.println("Editorial almacenada exitosamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error del sistema durante el almacenamiento de la editorial");
        }
    }

    @Override
    public void modificar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
