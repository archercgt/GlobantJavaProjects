// Esta clase hereda de la clase padre DAO y vemos que
// se especifica la generalización (<T>) como Autor
// esto permite que los métodos heredados donde se solicita
// una parámetro T, en esta clase serán de tipo Autor
package persistencia;

import entidades.Autor;
import javax.persistence.NoResultException;

/**
 *
 * @author Archer
 */
public class AutorDAO extends DAO<Autor> {

    public Boolean validarAutor(String nombre) {
        try {
            conectar();
            Autor autor = new Autor();
            autor = (Autor) em.createQuery("SELECT a"
                    + " FROM Autor a"
                    + " WHERE a.nombre = :nombre").
                    setParameter("nombre", nombre).
                    getSingleResult();
            desconectar();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public Autor consultarPorId(int id) throws Exception {
        conectar();
        try {
            Autor autor = new Autor();
            autor = (Autor) em.createQuery("SELECT a"
                    + " FROM Autor a"
                    + " WHERE a.id = :id").
                    setParameter("id", id).
                    getSingleResult();
            desconectar();
            return autor;
        } catch (NoResultException e) {
            throw new Exception("Error: Autor no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    public Autor consultarPorNombre(String nombre) throws Exception {
        conectar();
        try {
            Autor autor = new Autor();
            autor = (Autor) em.createQuery("SELECT a"
                    + " FROM Autor a"
                    + " WHERE a.nombre LIKE :nombre").
                    setParameter("nombre", "%" + nombre + "%").
                    getSingleResult();
            desconectar();
            return autor;
        } catch (NoResultException e) {
            throw new Exception("Error: Autor no encontrado!!!");
        } catch (Exception e) {
            throw new Exception("Error durante la consulta");
        }
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }
}
