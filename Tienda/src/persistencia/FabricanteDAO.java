/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Fabricante;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public final class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre) VALUES "
                    + "('" + fabricante.getNombre() + "');";
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean validarCodigo(int cod_fab) throws Exception {
        ArrayList<Integer> codigos = new ArrayList();
        try {
            String sql = "SELECT codigo FROM fabricante;";
            consultarBase(sql);
            while(resultado.next()){
                codigos.add(resultado.getInt(1));
            }
            return codigos.contains(cod_fab);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
