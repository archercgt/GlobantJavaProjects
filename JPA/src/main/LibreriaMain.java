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
import servicios.ClienteServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;
import servicios.PrestamoServicio;

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
        ClienteServicio cs = new ClienteServicio();
        PrestamoServicio ps = new PrestamoServicio();

        final String[] mensaje = {
            "Bienvenido!!! Ingrese la opción que desea ejecutar:",
            "1. Crear un autor",
            "2. Crear una editorial",
            "3. Crear un libro",
            "4. Crear un cliente",
            "5. Crear un préstamo",
            "6. Modificar un autor",
            "7. Modificar una editorial",
            "8. Modificar un libro",
            "9. Modificar un cliente",
            "10. Modificar un permiso",
            "11. Consultar un autor",
            "12. Consultar una editorial",
            "13. Consultar un libro",
            "14. Consultar libros",
            "15. Consultar un cliente",
            "16. Consultar un permiso",
            "17. Salir"
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
                    cs.crear(scanner, em);
                    break;
                case "5":
                    ps.crear(scanner, em);
                    break;
                case "6":
                    as.modificar(scanner, em);
                    break;
                case "7":
                    es.modificar(scanner, em);
                    break;
                case "8":
                    ls.modificar(scanner, em);
                    break;
                case "9":
                    cs.modificar(scanner, em);
                    break;
                case "10":

                    break; 
                case "11":
                    System.out.println(as.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "12":
                    System.out.println(es.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "13":
                    System.out.println(ls.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "14":
                    System.out.println(ls.consultarLibros(scanner, em));
                    System.out.println("");
                    break;
                case "15":
                    System.out.println(cs.consultar(scanner, em));
                    System.out.println("");
                    break;
                case "16":

                    break;
                case "17":
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
