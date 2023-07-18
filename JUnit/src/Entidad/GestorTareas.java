/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.ArrayList;
/**
 *
 * @author Archer
 */
public class GestorTareas {
    private ArrayList<String> tareas = new ArrayList<>();

    public GestorTareas() {
    }
    
    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }
    
    public void agregarTarea(String tarea){
        tareas.add(tarea);
    }
    
    public void eliminarTarea(String tarea){
        if(tareas.contains(tarea)){
            tareas.remove(tarea);
        }else{
            System.out.println("La terea no se encuentra creada");
            System.out.println("");
        }
    }
    
    public void listarTareas(){
        System.out.println("A contiuación se listan las tareas almacenadas:");
        for(String tarea:tareas){
            System.out.println(tarea);
        }
    }
    
}