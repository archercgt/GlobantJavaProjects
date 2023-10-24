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
public class EditorialServicio extends Servicio {

    public EditorialServicio() {
    }

    public Editorial consultar(Scanner scanner, EntityManager em) throws Exception {
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
            return editorial;
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (NoResultException e) {
            throw new Exception("Error: Editorial no encontrada!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    public void crear(Scanner scanner, EntityManager em) throws Exception{
        Editorial editorial = new Editorial();
        try {
            System.out.println("Ingrese el nombre de la editorial a almacenar");
            String nombre = validarInput(scanner);
            if (validarEditorial(nombre, em) != null) {
                throw new Exception("Error: La editorial ya existe");
            }
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            System.out.println("Editorial almacenada exitosamente");
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Scanner scanner, EntityManager em) throws Exception {
        Editorial editorial = consultar(scanner, em);
        final String[] mensaje = {
            "Indique la opción según la modificación que desee hace sobre la editorial;",
            "1. Dar de alta/baja",
            "2. Modificar el nombre"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Seleccione según desee dar de alta o de baja la editorial");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                String opcion2 = validarInput(scanner);
                switch (opcion2) {
                    case "1":
                        editorial.setAlta(true);
                        break;
                    case "2":
                        editorial.setAlta(false);
                        break;
                }
                break;
            case "2":
                System.out.println("Ingrese el nuevo nombre que tendrá la editorial");
                String nombre = validarInput(scanner);
                editorial.setNombre(nombre);
                break;
            default:
                System.out.println("La opción ingresada es invalida");
        }
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
        System.out.println("Editorial modificada con éxito");
        System.out.println("");
    }

    public void eliminar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Editorial validarEditorial(String nombre, EntityManager em) {
        Editorial editorial = (Editorial) em.createQuery("SELECT e"
                + " FROM Editorial e"
                + " WHERE e.nombre = :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        return editorial;
    }
}
