/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class MesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] mesesDelAño = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Random aleatorio = new Random();
        int numero_aleatorio = aleatorio.nextInt(12);
        String mes_secreto = mesesDelAño[numero_aleatorio];
        boolean acertado = false;
        Scanner leer = new Scanner(System.in);
        while(!acertado){
            System.out.println("Intente adivinar el mes secreto");
            String mes_usuario = leer.nextLine().toLowerCase();
            if(mes_usuario.equals(mes_secreto)){
                System.out.println("Felicitaciones, ha acertado!!!");
                acertado = true;
            }
        }
        leer.close();
    }
}
