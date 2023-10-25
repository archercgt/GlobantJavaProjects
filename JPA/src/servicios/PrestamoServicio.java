/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Prestamo;
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
}
