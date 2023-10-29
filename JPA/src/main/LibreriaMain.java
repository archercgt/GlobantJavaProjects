/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
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

        final AutorServicio as = new AutorServicio();
        final EditorialServicio es = new EditorialServicio();
        final LibroServicio ls = new LibroServicio();
        final ClienteServicio cs = new ClienteServicio();
        final PrestamoServicio ps = new PrestamoServicio();

        final String[] mensaje = {
            "Bienvenido!!! Ingrese la opción según el elemento con el que desee interactuar:",
            "1. Autor",
            "2. Editorial",
            "3. Libro",
            "4. Cliente",
            "5. Préstamos",
            "6. Salir de la aplicación",
            ""
        };
        while (continuar) {
            for (String line : mensaje) {
                System.out.println(line);
            }
            String opcion = validarInput(scanner);
            switch(opcion){
                case "1":
                    as.menu(scanner, "autor");
                    break;
                case "2":
                    es.menu(scanner, "editorial");
                    break;
                case "3":
                    ls.menu(scanner, "libro");
                    break;
                case "4":
                    cs.menu(scanner, "cliente");
                    break;                    
                case "5":
                    ps.menu(scanner, "préstamo");
                    break;                    
                case "6":
                    continuar = false;
                    System.out.println("Hasta luego, Vuelva pronto!!!");
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta");
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
