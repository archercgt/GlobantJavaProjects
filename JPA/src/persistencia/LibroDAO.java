/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Libro;
import java.util.Collection;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class LibroDAO extends DAO<Libro> {

    public boolean validarLibro(String titulo) {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l"
                    + " FROM Libro l"
                    + " WHERE l.titulo = :titulo").
                    setParameter("titulo", titulo).
                    getSingleResult();
            desconectar();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public Libro buscarPorIsbn(Long isbn) throws Exception {
        try {
            Libro libro = new Libro();
            libro = (Libro) em.createQuery("SELECT l"
                    + " FROM Libro l"
                    + " WHERE l.isbn = :isbn").
                    setParameter("isbn", isbn).
                    getSingleResult();
            return libro;
        } catch (Exception e) {
            throw e;
        }

    }

    public Libro buscarPorTitulo(String titulo) throws Exception {
        try {
            Libro libro = new Libro();
            libro = (Libro) em.createQuery("SELECT l"
                    + " FROM Libro l"
                    + " WHERE l.titulo = :titulo").
                    setParameter("titulo", titulo).
                    getSingleResult();
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarPorAutor(String titulo) throws Exception {
        try {
            Collection<Libro> libros = em.createQuery("SELECT l"
                    + " FROM Libro l"
                    + " JOIN l.autor a"
                    + " WHERE a.nombre = :nombre").
                    setParameter("nombre", titulo).
                    getResultList();
            System.out.println(libros);
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarPorEditorial(String nombre) throws Exception {
        try {
            Collection<Libro> libros = em.createQuery("SELECT l"
                    + " FROM Libro l"
                    + " JOIN l.editorial e"
                    + " WHERE e.nombre = :nombre").
                    setParameter("nombre", nombre).
                    getResultList();
            System.out.println(libros);
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }
}
