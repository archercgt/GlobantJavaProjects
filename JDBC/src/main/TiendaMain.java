/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import servicios.FabricanteServicio;
import servicios.ProductoServicio;

/**
 *
 * @author Archer
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        boolean menu = true;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        while(menu){
            System.out.println("Bienvenido al aplicativo Tienda" + "\n");
            System.out.println("Por favor ingrese una de las siguientes opciones:" + "\n");
            System.out.println("a. Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("b. Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("c. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("d. Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("e. Listar el nombre y el precio del producto más barato.");
            System.out.println("f. Ingresar un producto a la base de datos.");
            System.out.println("g. Ingresar un fabricante a la base de datos.");
            System.out.println("h. Editar un producto con datos a elección.");
            System.out.println("i. Finalizar el programa" + "\n");
            String opcion = scanner.next().toLowerCase();

            switch(opcion){
                case "a":
                    ps.listarNombreProductos();
                    break;
                case "b":
                    ps.listarNombrePrecioProductos();
                    break;
                case "c":
                    ps.listarNombrePrecio120_202();
                    break;
                case "d":
                    ps.listarPortatiles();
                    break;
                case "e":
                    ps.listarBarato();
                    break;
                case "f":
                    ps.ingresarProducto(scanner);
                    break;
                case "g":
                    fs.ingresarFabricante(scanner);
                    break;
                case "h":
                    ps.editarProducto(scanner);
                    break;
                case "i":
                    menu = false;
                    System.out.println("Hasta luego, vuelva pronto");
                    break;
                default:
                    System.out.println("Ingresó una opción incorrecta");
            }
        }
        scanner.close();
    }
}
