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
import servicios.LibroServicio;

/**
 *
 * @author Archer
 */
public class LibreriaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();
        
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
        
        //as.crear(scanner, em);
        //es.crear(scanner, em);
        //System.out.println(as.consultar(scanner, em));
        //System.out.println(es.consultar(scanner, em));
        //ls.crear(scanner, em);
        es.modificar(scanner, em);
        System.out.println(es.consultar(scanner, em));
        
        
        scanner.close();
    }
    
}
