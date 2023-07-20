/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.RazaService;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class RazasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        String opcion;
        Scanner leer = new Scanner(System.in);
        RazaService rs = new RazaService();
        System.out.println("Bienvenido al programa para alamacenar razas de perros");
        while(continuar){
            System.out.println("Por favor ingrese una raza de perro");
            rs.agregarRaza(leer.nextLine());
            System.out.println("Desea ingresar otra raza: s/n");
            opcion = leer.nextLine();
            if (opcion.equals("n")){
                continuar = false;
                rs.listarRazas();
                System.out.println("Ingrese una raza de perro");
                rs.eliminarRaza(leer.nextLine());
            }
        }
        leer.close();
    }
    
}
