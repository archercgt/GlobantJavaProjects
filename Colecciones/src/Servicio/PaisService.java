/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class PaisService {
    private HashSet<String> paises;
    private Scanner leer;

    public PaisService() {
        paises = new HashSet();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void AgregarPaises(){
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese el nombre del país");
            paises.add(leer.next());
            System.out.println("Desea ingresar otro país s/n");
            String opcion = leer.next();
            if(opcion.equals("n")){
                continuar = false;
                System.out.println("Los paises almacenados son: ");
                paises.forEach((pais) -> System.out.println(pais));
                organizarAlfabeticamente();
                System.out.println("Ingrese un pais para buscar");
                String pais = leer.next();
                eliminarPais(pais);
            }
        }
    }
    
    public void organizarAlfabeticamente(){
        ArrayList<String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        System.out.println("A continuación de presenta la lista de paises ordenados");
        listaPaises.forEach((pais) -> System.out.println(pais));
    }
    
    public void eliminarPais(String pais){
        boolean eliminado = false;
        Iterator iterator = paises.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(pais)){
                iterator.remove();
                eliminado = true;
            }
        }
        if(eliminado){
            System.out.println("El elemento se eliminó exitosamente");
            System.out.println("A continuación se presenta el nuevo conjunto de países");
            paises.forEach((e) -> System.out.println(e));
        }else{
            System.out.println("El país ingresado no se encontró");
        }
        
    }
}
