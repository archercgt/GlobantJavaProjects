/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author Archer
 */
public class Servicio {

    public Servicio() {
    }

    public String validarInput(Scanner scanner) throws Exception {
        String input = scanner.next();
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("El valor ingresar no puede estar vacío");
        }
        return input;
    }

    public void consultar(Scanner scanner){
        
    };

    public void crear(Scanner scanner, EntityManager em){
        
    };

    public void modificar(Scanner scanner){
        
    };

    public void eliminar(Scanner scanner){
        
    };
}
