/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Servicio.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class MainPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cerrar = false;
        Scanner leer = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();
        while(!cerrar){
            System.out.println("Bienvenido a Blockbuster");
            System.out.println("Por favor ingrese una de las siguientes opciones");
            System.out.println("1. Cargar película");
            System.out.println("2. Listar películas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Listar los alquileres");
            System.out.println("5. Buscar por título");
            System.out.println("6. Buscar por genero");
            System.out.println("7. Buscar alquiler por fecha");
            System.out.println("8. Finalizar");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    ps.crearPelicula();
                    System.out.println("Película ingresada correctamente");
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    if(ps.buscarTitulo()){
                        System.out.println("La película existe");
                        System.out.println("");
                    }
                    else{
                        System.out.println("La película NO existe");
                        System.out.println("");
                    }                        
                    break;
                case 6:
                    ps.buscarGenero();
                    break;
                case 7:
                    break;
                case 8:
                    cerrar = true;
                    break;
                default:
                    System.out.println("La opción ingresada no es valida");
                    System.out.println("");
                    break;                                    
            }
        }
    }    
}