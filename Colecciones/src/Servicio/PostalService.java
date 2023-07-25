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
public class PostalService {
    private HashMap<Integer, String> codigos;
    private Scanner leer;

    public PostalService() {
        codigos = new HashMap();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarCodigoPostal(){
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese un código postal");
            Integer codigo = leer.nextInt();
            System.out.println("Ingrese la ciudad");
            String ciudad = leer.next();
            codigos.put(codigo, ciudad);
            System.out.println("Desea ingredar otro codigo s/n");
            String opcion = leer.next();
            if(opcion.equals("n")){
                continuar = false;
            }
        }
    }
    
    public void mostarCodigos(){
        if(codigos.isEmpty()){
            System.out.println("El mapa no contiene códigos");
        }else {
            System.out.println("A continuación se muestran los códigos almacenados: ");
            for(Map.Entry<Integer, String> entry: codigos.entrySet()){
                System.out.println("Codigo: " + entry.getKey() + ", ciudad: " + entry.getValue());
            }
            System.out.println("");
        }

    }
    
    public void buscarCodigo(){
        System.out.println("Ingrese el códgo que desea buscar");
        Integer codigo = leer.nextInt();
        if(codigos.containsKey(codigo)){
            System.out.println("La ciudad correspondiente al código es: " + codigos.get(codigo));
            System.out.println("");
        }else{
            System.out.println("El código no existe en el mapa");
            System.out.println("");
        } 
    }
    
    public void eliminarCodigo(){
        System.out.println("Ingrese el códgo que desea eliminar");
        Integer codigo = leer.nextInt();
        if(codigos.containsKey(codigo)){
            codigos.remove(codigo);
            System.out.println("El código se eliminó correctamente");
            System.out.println("");
        }else{
            System.out.println("El código ingresado no existe en el mapa");
            System.out.println("");
        }
    }
}
