/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Autor;
import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author Archer
 */
public class AutorServicio extends Servicio{

    public AutorServicio() {
    }

    @Override
    public void consultar(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Scanner scanner, EntityManager em) {
        Autor autor = new Autor();
        try {
            System.out.println("Ingrese el nombre del autor a almacenar");
            String nombre = validarInput(scanner);
            autor.setNombre(nombre);
            autor.setAlta(true);
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            System.out.println("Autor almacenado exitosamente");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error del sistema durante el almacenamiento del usuario");
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
