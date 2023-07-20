/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Archer
 */
public class RazaService {
    private ArrayList<String> razas;

    public RazaService() {
        razas = new ArrayList();
    }
    
    public void agregarRaza(String raza){
        razas.add(raza);
    }
    
    public void listarRazas(){
        System.out.println("Las razas almacenadas son:");
        razas.forEach((raza) -> System.out.println(raza));
        System.out.println("");
    }
    
    public void eliminarRaza(String raza){
        Iterator iterator = razas.iterator();
        boolean encontrada = false;
        while(iterator.hasNext()){
            if(iterator.next().equals(raza)){
                iterator.remove();
                encontrada = true;
                break;
            }
        }
        if(encontrada){
            System.out.println("Raza eliminada con éxito");
            System.out.println("");
            Collections.sort(razas);
            listarRazas();
        }else{
            System.out.println("La raza no se encontró");
            System.out.println("");
            Collections.sort(razas);
            listarRazas();
        }  
    }
}
