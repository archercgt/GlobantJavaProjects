/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Cliente;

/**
 *
 * @author Archer
 */
public class ClienteDAO extends DAO<Cliente> {

    public boolean validarCliente(Long documento) {
        try {
            Cliente cliente = (Cliente) em.createQuery("SELECT c"
                    + " FROM Cliente c"
                    + " WHERE c.documento = :documento").
                    setParameter("documento", documento).
                    getSingleResult();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }

    public Cliente buscarPorId(int id) throws Exception {
        try {
            Cliente cliente = (Cliente) em.createQuery("SELECT c"
                    + " FROM Cliente c"
                    + " WHERE c.id = :id").
                    setParameter("id", id).
                    getSingleResult();
            return cliente;
        } catch (Exception e) {
            throw e;
        }

    }

    public Cliente buscarPorDocumento(Long documento) throws Exception {
        try {
            Cliente cliente = (Cliente) em.createQuery("SELECT c"
                    + " FROM Cliente c"
                    + " WHERE c.documento = :documento").
                    setParameter("documento", documento).
                    getSingleResult();
            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void editar(Cliente cliente) {
        super.editar(cliente);
    }
}
