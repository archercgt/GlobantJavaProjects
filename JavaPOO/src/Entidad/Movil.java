/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Movil {
    private String marca, modelo;
    private double precio;
    private int memoriaRam;
    private int [] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, double precio, int memoriaRam) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    
    public void ingresarCodigo(){
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese el numero " + i + " del código");
            this.codigo[i] = leer.nextInt();
        }
    }
    
    public void cargarCelular(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la marca del celular");
        this.marca = leer.nextLine();
        System.out.println("Ingreese el modelo del celular");
        this.modelo = leer.nextLine();
        System.out.println("Ingrese la memoria RAM del celular");
        this.memoriaRam = leer.nextInt();
        System.out.println("Ingrese el precio del celular");
        this.precio = leer.nextDouble();
        this.ingresarCodigo();
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", memoriaRam=" + memoriaRam + ", codigo=" + codigo + '}';
    }
    
    
}