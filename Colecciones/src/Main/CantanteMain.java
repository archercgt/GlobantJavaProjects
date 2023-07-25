/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.CantanteService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class CantanteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CantanteService cs = new CantanteService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        System.out.println("Bienvenido al plicativo de cantantes famosos");
        while(continuar){
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("1 Agregar cantante");
            System.out.println("2 Mostrat cantantes almacenados");
            System.out.println("3 Eliminar cantante");
            System.out.println("4 Salir del menú");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    cs.agregarCantante();
                    break;
                case 2:
                    cs.mostrarCantantes();
                    break;
                case 3:
                    cs.eliminarCantante();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("La opción ingresada no es valida, intente de nuevo");
                    System.out.println("");
            }
        }
    }  
}
