/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.PostalService;

/**
 *
 * @author Archer
 */
public class PostalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PostalService ps = new PostalService();
        ps.agregarCodigoPostal();
        ps.mostarCodigos();
        ps.buscarCodigo();
        ps.eliminarCodigo();
        ps.mostarCodigos();
    }
    
}
