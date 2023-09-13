/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicio.AhorcadoService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class MainAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AhorcadoService as = new AhorcadoService();
        as.crearJuego();
        while(as.getJuego_servicio().getOportunidades() > 0){
            System.out.println("Ingrese una letra:");
            char letra = leer.nextLine().charAt(0);
            as.buscar(letra);
            as.intentos(as.encontradas(letra));
        }
        leer.close();
    }
    
}
