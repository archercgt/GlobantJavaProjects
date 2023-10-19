/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author Archer
 */
public class EditorialServicio extends Servicio{

    public EditorialServicio() {
    }

    @Override
    public void consultar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Scanner scanner, EntityManager em) {
        Editorial editorial = new Editorial();
        try {
            System.out.println("Ingrese el nombre de la editorial a almacenar");
            String nombre = validarInput(scanner);
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            System.out.println("Editorial almacenada exitosamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error del sistema durante el almacenamiento de la editorial");
        }
    }

    @Override
    public void modificar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
