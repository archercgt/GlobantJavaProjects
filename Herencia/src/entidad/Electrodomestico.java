/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public abstract class Electrodomestico {

    protected int precio, peso;
    protected String color, consumo_energetico;
    private ArrayList<String> consumos_permitidos, colores_permitidos;
    protected Scanner leer;
    private HashMap<String, Integer> consumo_precio;

    public Electrodomestico() {
        precio = 1000;
        consumos_permitidos = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        colores_permitidos = new ArrayList<>(Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
        leer = new Scanner(System.in).useDelimiter("\n");
        consumo_precio = new HashMap();
        consumo_precio.put("A", 1000);
        consumo_precio.put("B", 800);
        consumo_precio.put("C", 600);
        consumo_precio.put("D", 500);
        consumo_precio.put("E", 300);
        consumo_precio.put("F", 100);
    }

    public Electrodomestico(int precio, int peso, String color, String consume_energetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(color);
    }

    private String comprobarConsumoEnergetico(String letra) {
        if (consumos_permitidos.contains(letra.toUpperCase())) {
            return letra.toUpperCase();
        } else {
            return "F";
        }
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color");
        color = (leer.next());
        System.out.println("Ingrese una letra para el consumo energético");
        consumo_energetico = (leer.next().toUpperCase());
        System.out.println("Ingrese el peso");
        peso = (leer.nextInt());
    }

    public void precioFinal() {
        precio += consumo_precio.get(consumo_energetico);
        if ((peso >= 1) && (peso <= 19)) {
            agregarPrecio(100);
        }
        if ((peso >= 20) && (peso <= 49)) {
            agregarPrecio(500);
        }
        if ((peso >= 50) && (peso <= 79)) {
            agregarPrecio(800);
        }
        if (peso >= 80) {
            agregarPrecio(1000);
        }
    }

    protected void agregarPrecio(int precio) {
        this.precio += precio;
    }

    private String comprobarColor(String color) {
        if (colores_permitidos.contains(color.toLowerCase())) {
            return color.toLowerCase();
        } else {
            return "blanco";
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo_energetico=" + consumo_energetico + '}';
    }
    
}
