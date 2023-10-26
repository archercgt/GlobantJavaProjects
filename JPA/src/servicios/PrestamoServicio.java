/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.sql.Date;
import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author Archer
 */
public class PrestamoServicio extends Servicio {

    public PrestamoServicio() {
    }

    public Prestamo consultar(Scanner scanner, EntityManager em) throws Exception {
        Prestamo prestamo = new Prestamo();
        return prestamo;
    }

    public void crear(Scanner scanner, EntityManager em) throws Exception {
        Prestamo prestamo = new Prestamo();
        ClienteServicio cs = new ClienteServicio();
        LibroServicio ls = new LibroServicio();
        try {
            System.out.println("Ingrese la fecha de prestamo en el formato YYYY-MM-DD");
            String f_prestamo_str = validarInput(scanner);
            Date f_prestamo = Date.valueOf(f_prestamo_str);
            System.out.println("Ingrese la fecha de devolución en el formato YYYY-MM-DD");
            String f_devolucion_str = validarInput(scanner);
            Date f_devolucion = Date.valueOf(f_devolucion_str);
            if (f_prestamo.after(f_devolucion)) {
                throw new Exception("La fecha de prestamo no puede ser menor a la fecha de devolución");
            }
            prestamo.setFechaPrestamo(f_prestamo);
            prestamo.setFechaDevolucion(f_devolucion);
            Cliente cliente = cs.consultar(scanner, em);
            prestamo.setCliente(cliente);
            Libro libro = ls.consultar(scanner, em);
            if (libro.getEjemplaresRestantes() > 0) {
                prestamo.setLibro(libro);
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();
                em.getTransaction().begin();
                em.persist(prestamo);
                em.getTransaction().commit();
            } else {
                throw new Exception("Error: no se puede realizar el prestámo ya que no hay ejemplares disponibles");
            }
        } catch (IllegalArgumentException e) {
            throw new Exception("Error: La fecha debe estar en el formato YYYY-MM-DD");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Scanner scanner, EntityManager em) throws Exception {
        Prestamo prestamo = new Prestamo();
    }

}