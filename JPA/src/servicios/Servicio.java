/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Servicio<T>{

    public String validarInput(Scanner scanner) throws Exception {
        String input = scanner.next();
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("El valor ingresar no puede estar vacío");
        }
        return input;
    }
    
     public void consultar(Scanner scanner) throws Exception{
    }

    public void crear(Scanner scanner) throws Exception{
    }

    public void modificar(Scanner scanner) throws Exception{
    }

    public void eliminar() {
    }

    public void menu(Scanner scanner, String nom_entidad) throws Exception {
        boolean continuar = true;

        while (continuar) {
            final String[] mensaje = {
                "Indique la opción según la acción que desea realizar:",
                "1. Crear " + nom_entidad,
                "2. Consultar " + nom_entidad + "(s)",
                "3. Modifcar " + nom_entidad,
                "4. Eliminar " + nom_entidad,
                "5. Regresar al menú anterior",
                ""
            };
            for (String line : mensaje) {
                System.out.println(line);
            }
            try {
                String opcion = validarInput(scanner);
                switch (opcion) {
                    case "1":
                        crear(scanner);
                        break;
                    case "2":
                        consultar(scanner);
                        break;
                    case "3":
                        modificar(scanner);
                        break;
                    case "4":
                        eliminar();
                        break;
                    case "5":
                        continuar = false;
                        break;
                    default:
                        System.out.println("La opción ingresada es incorrecta!!!");
                        System.out.println("");
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
