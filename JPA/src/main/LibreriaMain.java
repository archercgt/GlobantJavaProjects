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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();

        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();

        final String[] mensaje = {
            "Bienvenido!!! Ingrese la opción que desea ejecutar:",
            "1. Crear un autor",
            "2. Crear una editorial",
            "3. Crear un libro",
            "4. Modificar un autor",
            "5. Modificar una editorial",
            "6. Modificar un libro",
            "7. Consultar un autor",
            "8. Consultar una editorial",
            "9. Consultar un libro",
            "10. Consultar libros",
            "11. Salir"
        };
        while (continuar) {
            for (String line : mensaje) {
                System.out.println(line);
            }
            String opcion = validarInput(scanner);

            switch (opcion) {
                case "1":
                    as.crear(scanner, em);
                    break;
                case "2":
                    es.crear(scanner, em);
                    break;
                case "3":
                    ls.crear(scanner, em);
                    break;
                case "4":
                    as.modificar(scanner, em);
                    break;
                case "5":
                    es.modificar(scanner, em);
                    break;
                case "6":
                    ls.modificar(scanner, em);
                    break;
                case "7":
                    System.out.println(as.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "8":
                    System.out.println(es.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "9":
                    System.out.println(ls.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "10":
                    System.out.println(ls.consultarLibros(scanner, em));
                    System.out.println("");
                    break; 
                case "11":
                    System.out.println("Hasta luego, Vuelva pronto!!!");
                    continuar = false;
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
            }
        }
        scanner.close();
    }

    public static String validarInput(Scanner scanner) throws Exception {
        String input = scanner.next();
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("El valor ingresar no puede estar vacío");
        }
        return input;
    }
}
