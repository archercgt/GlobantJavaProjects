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
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import persistencia.ClienteDAO;
import persistencia.LibroDAO;
import persistencia.PrestamoDAO;

/**
 *
 * @author Archer
 */
public class PrestamoServicio extends Servicio {

    ClienteDAO clienteDAO = new ClienteDAO();
    PrestamoDAO prestamoDAO = new PrestamoDAO();
    LibroDAO libroDAO = new LibroDAO();
    ClienteServicio cs = new ClienteServicio();
    LibroServicio ls = new LibroServicio();
    

    @Override
    public void crear(Scanner scanner) throws Exception {
        Prestamo prestamo = new Prestamo();
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
            System.out.println("Ingrese el id del cliente que se asignará al préstamo");
            int id = Integer.valueOf(validarInput(scanner));
            Cliente cliente = clienteDAO.buscarPorId(id);
            prestamo.setCliente(cliente);
            System.out.println("Ingrese el ISBN del libro que se asignará al préstamo");
            Long isbn = Long.parseLong(validarInput(scanner));
            Libro libro = libroDAO.buscarPorIsbn(isbn);
            if (libro.getEjemplaresRestantes() > 0) {
                prestamo.setLibro(libro);
                if (prestamoDAO.validacionPrestamo(prestamo)) {
                    throw new Exception("Error: el préstamo ya existe");
                }
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                libroDAO.editar(libro);
                prestamoDAO.guardar(prestamo);
            } else {
                throw new Exception("Error: no se puede realizar el prestámo ya que no hay ejemplares disponibles");
            }
        } catch (IllegalArgumentException e) {
            throw new Exception("Error: La fecha debe estar en el formato YYYY-MM-DD");
        } catch (Exception e) {
            throw e;
        }
    }

//    public Prestamo consultar(Scanner scanner, EntityManager em) throws Exception {
//        Prestamo prestamo = new Prestamo();
//        return prestamo;
//    }
//
//
//    public void modificar(Scanner scanner, EntityManager em) throws Exception {
//        Prestamo prestamo = new Prestamo();
//    }
//

}
