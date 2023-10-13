/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Fabricante;
import java.util.Scanner;
import persistencia.FabricanteDAO;

/**
 *
 * @author Archer
 */
public class FabricanteServicio {

    private final FabricanteDAO fabricanteDAO;

    public FabricanteServicio() {
        fabricanteDAO = new FabricanteDAO();
    }

    public void ingresarFabricante(Scanner scanner) throws Exception {
        Fabricante fabricante = new Fabricante();
        try {
            System.out.println("Ingrese el nombre del fabricante a almacenar");
            String nombre = scanner.next();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre no puede estar vacio");
            }
            fabricante.setNombre(nombre);
            fabricanteDAO.guardarFabricante(fabricante);
            System.out.println("El fabricante se almacenó correctamente");
            System.out.println("");
        } catch (Exception e) {
            throw e;
        }
    }
}
