/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import com.sun.imageio.plugins.jpeg.JPEG;
import entidades.Producto;
import java.util.Scanner;
import persistencia.FabricanteDAO;
import persistencia.ProductoDAO;

/**
 *
 * @author Archer
 */
public class ProductoServicio {

    private final ProductoDAO productoDAO;
    private final FabricanteDAO fabricanteDAO;

    public ProductoServicio() {
        productoDAO = new ProductoDAO();
        fabricanteDAO = new FabricanteDAO();
    }

    public void listarNombreProductos() throws Exception {

        System.out.println("A continuación se listan los productos almacenados:");
        if (productoDAO.productos.isEmpty()) {
            productoDAO.buscarProductos();
            productoDAO.imprimirNombreProductos();
        } else {
            productoDAO.imprimirNombreProductos();
        }

    }

    public void listarNombrePrecioProductos() throws Exception {

        System.out.println("A continuación se listan los productos almacenados junto con sus precios:");
        if (productoDAO.productos.isEmpty()) {
            productoDAO.buscarProductos();
            productoDAO.imprimirNombrePrecioProductos();
        } else {
            productoDAO.imprimirNombrePrecioProductos();
        }

    }

    public void listarNombrePrecio120_202() throws Exception {
        System.out.println("A continuación se listan los productos almacenados con precios en el rango $120 - $202:");
        if (productoDAO.productos.isEmpty()) {
            productoDAO.buscarProductos();
            productoDAO.imprimirNombrePrecio120_202();
        } else {
            productoDAO.imprimirNombrePrecio120_202();
        }

    }

    public void listarPortatiles() throws Exception {
        System.out.println("A continuación se listan los productos portátiles");
        if (productoDAO.productos.isEmpty()) {
            productoDAO.buscarProductos();
            productoDAO.imprimirPortatiles();
        } else {
            productoDAO.imprimirPortatiles();
        }

    }

    public void listarBarato() throws Exception {
        System.out.println("A continuación se lista el producto más barato");
        productoDAO.imprimirBarato();
        System.out.println("");
    }

    public void ingresarProducto(Scanner scanner) throws Exception {
        Producto producto = ingresarInfoProducto(scanner);
        productoDAO.guardarProducto(producto);
        System.out.println("Producto almacenado con exito");
        System.out.println("");
    }

    public void editarProducto(Scanner scanner) throws Exception {
        System.out.println("Ingrese el código del producto que desea editar");
        int codigo = validarProducto(scanner);
        Producto producto = ingresarInfoProducto(scanner);
        producto.setCodigo(codigo);
        productoDAO.actualizarProducto(producto);
        System.out.println("Producto editado con exito");
    }

    public Producto ingresarInfoProducto(Scanner scanner) throws Exception {
        Producto producto = new Producto();
        try {
            System.out.println("Ingrese el nombre el producto");
            producto.setNombre(validarInput(scanner));
            System.out.println("Ingrese el precio del producto");
            double precio = Double.parseDouble(validarInput(scanner));
            producto.setPrecio(precio);
        } catch (NumberFormatException e) {
            throw new Exception("El valor ingresado debe ser un numero");
        }
        try {
            System.out.println("Ingrese el codigo del fabricante");
            int cod_fab = Integer.parseInt(validarInput(scanner));
            if (!fabricanteDAO.validarCodigo(cod_fab)) {
                throw new Exception("El código de fabricante ingresado no existe");
            }
            producto.setCodigoFabricante(cod_fab);
        } catch (NumberFormatException e) {
            throw new Exception("El codigo del fabricante debe ser un numero entero");
        }
        return producto;
    }

    public String validarInput(Scanner scanner) throws Exception {
        String input = scanner.next();
        if (input == null || input.trim().isEmpty()) {
            throw new Exception("El valor ingresar no puede estar vacío");
        }
        return input;
    }

    public int validarProducto(Scanner scanner) throws Exception{
        try {
            int codigo = Integer.parseInt(validarInput(scanner));
            if (!productoDAO.validarCodigo(codigo)) {
                throw new Exception("El código de producto ingresado no existe");
            }
            return codigo;
        } catch (NumberFormatException e) {
            throw new Exception("El codigo ingresado debe ser un numero entero");
        }
    }
}
