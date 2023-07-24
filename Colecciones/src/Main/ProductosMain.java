/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class ProductosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        System.out.println("Bienvenido al aplicativo de productos");
        while(continuar){
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("1 Agregar producto");
            System.out.println("2 Modificar precio");
            System.out.println("3 Eliminar producto");
            System.out.println("4 Listar productos almacenados");
            System.out.println("5 Salir del menú");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1: 
                    ps.agregarProducto();
                    break;
                case 2: 
                    ps.modificarPrecio();
                    break;
                case 3: 
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Ingresó una opción invalida, intente de nuevo");
                    System.out.println("");
            }
        }
    }
}
