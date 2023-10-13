/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public final class ProductoDAO extends DAO {

    public ArrayList<Producto> productos;

    public ProductoDAO() {
        productos = new ArrayList();
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ('" + producto.getNombre() + "', " + producto.getPrecio() + ", "
                    + producto.getCodigoFabricante() + ");";
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void actualizarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " WHERE codigo = "
                    + producto.getCodigo() + ";";
            instarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void imprimirNombreProductos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre());
        }
        System.out.println("");
    }

    public void imprimirNombrePrecioProductos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + " -- Precio: $" + producto.getPrecio());
        }
        System.out.println("");
    }

    public void imprimirNombrePrecio120_202() {
        for (Producto producto : productos) {
            if (producto.getPrecio() >= 120 && producto.getPrecio() <= 202) {
                System.out.println("Producto: " + producto.getNombre() + " -- Precio: $" + producto.getPrecio());
            }
        }
        System.out.println("");
    }

    public void imprimirPortatiles() {
        for (Producto producto : productos) {
            String test = "portátil";
            if (producto.getNombre().toLowerCase().contains(test)) {
                System.out.println("Producto: " + producto.getNombre());
            }
        }
        System.out.println("");
    }

    public void imprimirBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1;";
            consultarBase(sql);
            String nombre = null;
            double precio = 0;
            while (resultado.next()) {
                nombre = resultado.getString(1);
                precio = resultado.getDouble(2);
            }
            desconectarBase();
            System.out.println("Producto: " + nombre + " -- Precio: $" + precio);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public boolean validarCodigo(int codigo) throws Exception {
        ArrayList<Integer> codigos = new ArrayList();
        try {
            String sql = "SELECT codigo FROM producto;";
            consultarBase(sql);
            while (resultado.next()) {
                codigos.add(resultado.getInt(1));
            }
            return codigos.contains(codigo);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
