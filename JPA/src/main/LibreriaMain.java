/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import servicios.AutorServicio;
import servicios.EditorialServicio;

/**
 *
 * @author Archer
 */
public class LibreriaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();
        
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        
        //as.crear(scanner, em);
        es.crear(scanner, em);
        
        scanner.close();
    }
    
}
