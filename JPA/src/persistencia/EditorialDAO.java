/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Editorial;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class EditorialDAO extends DAO<Editorial> {

    public Boolean validarEditorial(String nombre) {
        try {
            conectar();
            Editorial editorial = new Editorial();
            editorial = (Editorial) em.createQuery("SELECT e"
                    + " FROM Editorial e"
                    + " WHERE e.nombre = :nombre").
                    setParameter("nombre", nombre).
                    getSingleResult();
            desconectar();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    
    public Editorial consultarPorId(int id) throws Exception {
        conectar();
        try {
            Editorial editorial = new Editorial();
            editorial = (Editorial) em.createQuery("SELECT e"
                    + " FROM Editorial e"
                    + " WHERE e.id = :id").
                    setParameter("id", id).
                    getSingleResult();
            desconectar();
            return editorial;
        } catch (NoResultException e) {
            throw new Exception("Error: Editorial no encontrada!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    public Editorial consultarPorNombre(String nombre) throws Exception {
        conectar();
        try {
            Editorial editorial = new Editorial();
            editorial = (Editorial) em.createQuery("SELECT e"
                    + " FROM Editorial e"
                    + " WHERE e.nombre LIKE :nombre").
                    setParameter("nombre", "%" + nombre + "%").
                    getSingleResult();
            desconectar();
            return editorial;
        } catch (NoResultException e) {
            throw new Exception("Error: Editorial no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }    
}
