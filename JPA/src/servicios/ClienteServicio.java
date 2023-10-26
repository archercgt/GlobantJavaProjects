/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class ClienteServicio extends Servicio {

    public ClienteServicio() {
    }

    public Cliente consultar(Scanner scanner, EntityManager em) throws Exception {
        final String[] mensaje = {
            "Indique la opción según el parametro que desea utilizar para la búsqueda del cliente;",
            "1. Buscar cliente por ID",
            "2. Buscar cliente por documento"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        try {
            String opcion = validarInput(scanner);
            Cliente cliente = null;
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el ID del cliente");
                    int id = Integer.parseInt(validarInput(scanner));
                    cliente = (Cliente) em.createQuery("SELECT c"
                            + " FROM Cliente c"
                            + " WHERE c.id = :id").
                            setParameter("id", id).
                            getSingleResult();
                    break;
                case "2":
                    System.out.println("Ingrese el documento del cliente");
                    long documento = Long.parseLong(validarInput(scanner));
                    cliente = (Cliente) em.createQuery("SELECT c"
                            + " FROM Cliente c"
                            + " WHERE c.documento = :documento").
                            setParameter("documento", documento).
                            getSingleResult();
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
            return cliente;
        } catch (NumberFormatException e) {
            throw new Exception("Error: El valor ingresado debe ser un número!!!");
        } catch (NoResultException e) {
            throw new Exception("Error: Cliente no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    public void crear(Scanner scanner, EntityManager em) throws Exception {
        Cliente cliente = new Cliente();
        try {
            System.out.println("Ingrese el documento del cliente a almacenar");
            Long documento = Long.parseLong(validarInput(scanner));
            cliente.setDocumento(documento);
            if (validarCliente(documento, em) != null) {
                throw new Exception("Error: El cliente ya existe");
            }
            System.out.println("Ingrese el nombre del cliente a almacenar");
            String nombre = validarInput(scanner);
            cliente.setNombre(nombre);
            System.out.println("Ingrese el apellido del cliente a almacenar");
            String apellido = validarInput(scanner);
            cliente.setApellido(apellido);
            System.out.println("Ingrese el telefono del cliente a almacenar");
            String telefono = validarInput(scanner);
            cliente.setTelefono(telefono);
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            System.out.println("Cliente almacenado exitosamente");
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Scanner scanner, EntityManager em) throws Exception {
        Cliente cliente = consultar(scanner, em);
        final String[] mensaje = {
            "Indique la opción según la modificación que desee hace sobre el cliente;",
            "1. Modificar el nombre",
            "2. Modificar el apellido",
            "3. Modificar el telefono"
        };
        for (String line : mensaje) {
            System.out.println(line);
        }
        String opcion = validarInput(scanner);
        switch (opcion) {
            case "1":
                System.out.println("Ingrese el nuevo nombre que tendrá el cliente");
                String nombre = validarInput(scanner);
                cliente.setNombre(nombre);
                break;
            case "2":
                System.out.println("Ingrese el nuevo apellido que tendrá el cliente");
                String apellido= validarInput(scanner);
                cliente.setApellido(apellido);
                break;
            case "3":
                System.out.println("Ingrese el nuevo telefono que tendrá el cliente");
                String telefono= validarInput(scanner);
                cliente.setTelefono(telefono);
                break;                
            default:
                System.out.println("La opción ingresada es invalida");
        }
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        System.out.println("Cliente modificado con éxito");
        System.out.println("");        
    }

    public void eliminar(Scanner scanner, EntityManager em) throws Exception {
    }

    public Cliente validarCliente(Long documento, EntityManager em) {
        try {
            Cliente cliente = (Cliente) em.createQuery("SELECT c"
                    + " FROM Cliente c"
                    + " WHERE c.documento = :documento").
                    setParameter("documento", documento).
                    getSingleResult();
            return cliente;
        } catch (Exception e) {
            return null;
        }
    }
}
