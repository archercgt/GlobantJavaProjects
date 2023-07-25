/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class CantanteService {
    private ArrayList<CantanteFamoso> cantantes;
    private Scanner leer;

    public CantanteService() {
        cantantes = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarCantante(){
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del disco con más ventas");
        String disco = leer.next();
        cantantes.add(new CantanteFamoso(nombre, disco));
        System.out.println("El cantante se agregó correctamente");
        System.out.println("");
    }
    
    public void eliminarCantante(){
        boolean eliminado = false;
        System.out.println("Ingrese el nombre del cantante a eliminar");
        String nombre = leer.next();
        for(int i = 0; i < cantantes.size(); i++){
            CantanteFamoso cantante = cantantes.get(i);
            if(cantante.getNombre().equals(nombre)){
                cantantes.remove(cantante);
                eliminado = true;
                break;
            }
        }
        if(eliminado){
            System.out.println("El cantante se eliminó exitosamente");
            System.out.println("");
        }else{
            System.out.println("El cantante ingresado no se encontró");
            System.out.println("");
        }
    }
    
    public void mostrarCantantes(){
        if(cantantes.isEmpty()){
            System.out.println("No se han agregado cantantes");
            System.out.println("");
        }else{
            System.out.println("A contnuación se muestra la lista de los cantantes almacenados");
            for(CantanteFamoso cantante: cantantes){
                System.out.println("Cantante: " + cantante.getNombre() 
                    + ", Disco mas vendido: " + cantante.getDiscoConMasVentas());
            }
            System.out.println("");
        }
    }
}