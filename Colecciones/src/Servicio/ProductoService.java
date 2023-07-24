/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class ProductoService {
    private HashMap<String, Double> productos;
    private Scanner leer;

    public ProductoService() {
        productos = new HashMap();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el valor del producto");
        Double valor = leer.nextDouble();
        productos.put(nombre, valor);
        System.out.println("Elemento agregado correctamente");
        System.out.println("");
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = leer.next();
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
            System.out.println("El producto se eliminó correctamente");
            System.out.println("");
        }else{
            System.out.println("El producto ingresado no se encontró");
            System.out.println("");
        }
    }
    
    public void mostrarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay elementos almacenados");
            System.out.println("");
        }else{
            System.out.println("A continuación se listan los productos almacenados");
            for(Map.Entry<String, Double> entry: productos.entrySet()){
                System.out.println("Producto: " + entry.getKey() + ", Valor: $" + entry.getValue());
            }
            System.out.println("");
        }
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombre = leer.next();
        if(productos.containsKey(nombre)){
            System.out.println("Ingrese el nuevo precio");
            Double nuevoPrecio = leer.nextDouble();
            productos.put(nombre, nuevoPrecio);
            System.out.println("El precio se moificó correctamente");
            System.out.println("");
        }else{
            System.out.println("El producto ingresado no se encontró");
            System.out.println("");
        }
    }
}
