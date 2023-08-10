/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;
    private static ArrayList<Perro> lista_perros;
    private Scanner leer;

    public Persona() {
        lista_perros = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public static ArrayList<Perro> getPerros() {
        return lista_perros;
    }

    public static void setPerros(ArrayList<Perro> perros) {
        Persona.lista_perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

    public static void agregarPerros(ArrayList<Perro> perros){
        lista_perros = perros;
    }
    
    public void adoptarPerro(){
        if(lista_perros.isEmpty()){
            System.out.println("Aún no se han agregado perros");
        }else{
            System.out.println("Los perros almacenados son: ");
            for(Perro perro: lista_perros){
                System.out.println(perro.getNombre());
            }
        }
        System.out.println("Ingrese el nombre del perro que desee adoptar");
        String perro_in = leer.next();
        boolean encontrado = false;
        for(Perro perro: lista_perros){
            if(perro.getNombre().equals(perro_in)){
                encontrado = true;
                if(perro.getDueno()== null){
                    perro.setDueno(this);
                    this.setPerro(perro);
                }
                else{
                    System.out.println("El perro ingresado ya tiene dueño");
                }
            }
        }
        if (!encontrado){
            System.out.println("No se encontró el perro ingresado");
        }
    }
}
