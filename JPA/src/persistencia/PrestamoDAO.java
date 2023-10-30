/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Prestamo;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author Archer
 */
public class PrestamoDAO extends DAO<Prestamo> {

    public boolean validacionPrestamo(Prestamo prestamo) {
        // Define a JPQL query to check for the existence of a Prestamo with the same attributes
        String jpql = "SELECT p FROM Prestamo p WHERE p.fechaPrestamo = :fechaPrestamo "
                + "AND p.fechaDevolucion = :fechaDevolucion "
                + "AND p.libro = :libro "
                + "AND p.cliente = :cliente";

        // Create a TypedQuery from the JPQL query
        TypedQuery<Prestamo> query = em.createQuery(jpql, Prestamo.class);

        // Set parameters for the query
        query.setParameter("fechaPrestamo", prestamo.getFechaPrestamo());
        query.setParameter("fechaDevolucion", prestamo.getFechaDevolucion());
        query.setParameter("libro", prestamo.getLibro());
        query.setParameter("cliente", prestamo.getCliente());

        // Execute the query and retrieve the results
        List<Prestamo> resultList = query.getResultList();

        // Check if any matching Prestamo objects exist
        return !resultList.isEmpty();
    }
    
    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    @Override
    public void editar(Prestamo prestamo) {
        super.editar(prestamo);
    }

}
