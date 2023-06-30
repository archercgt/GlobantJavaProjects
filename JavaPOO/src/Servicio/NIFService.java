/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class NIFService {

    public NIFService() {
    }
    
    public NIF crearNif(){
        Scanner leer = new Scanner(System.in);
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        NIF mi_nif = new NIF();
        System.out.println("Ingrese el DNI(numero de 8 digitos)");
        mi_nif.setDni(leer.nextLong());
        int resto = (int) mi_nif.getDni()% 23;
        mi_nif.setLetra(letras[resto]);
        return mi_nif;
    }
    
    public void mostrar(NIF mi_nif){
        int longitud_dni = Long.toString(mi_nif.getDni()).length();
        System.out.println("El nif es: ");
        for(int i = 1; i <= (8-longitud_dni); i++){
            System.out.print("0");
        }
        System.out.println( mi_nif.getDni() + "-" + mi_nif.getLetra());
    }
}