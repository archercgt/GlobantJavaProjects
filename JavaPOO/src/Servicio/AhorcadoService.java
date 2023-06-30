/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class AhorcadoService {
    
    private Ahorcado juego_servicio;

    public AhorcadoService() {
    }
    
    public Ahorcado getJuego_servicio() {
        return juego_servicio;
    }

    public void setJuego_servicio(Ahorcado juego_servicio) {
        this.juego_servicio = juego_servicio;
    }
    
    public void crearJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra para el juego");
        String palabra_usuario = leer.nextLine();
        char[] palabra = new char [palabra_usuario.length()];
        for (int i = 0; i < palabra_usuario.length(); i++){
            palabra[i] = palabra_usuario.charAt(i);
        }
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int jugadas_maximas = leer.nextInt();
        Ahorcado juego = new Ahorcado(palabra, 0, jugadas_maximas);
        juego_servicio = juego;
    }
    
    public void longitud(){
        System.out.println("La longiutd de la palabra es: " + juego_servicio.getPalabra().length);
    }
    
    public void buscar(char letra){
        boolean existe = false;
        for(char lt:juego_servicio.getPalabra()){
            if(lt == letra){
                existe = true;
            }
        }
        if(existe)
            System.out.println("La letra pertenece a la palabra");
        else
            System.out.println("La letra NO pertenece a la palabra");
    }
    
    public boolean encontradas(char letra){
        for(char lt:juego_servicio.getPalabra()){
            if(lt == letra){
                int letras_actuales = juego_servicio.getLetras_encontradas();
                juego_servicio.setLetras_encontradas(letras_actuales + 1);
            }
        }
        if(juego_servicio.getLetras_encontradas() == juego_servicio.getPalabra().length){
            System.out.print("Felicitaciones, la palabra es: ");
            for(char lt:juego_servicio.getPalabra()){
                System.out.print(lt);
            }
            System.out.println("");
            juego_servicio.setOportunidades(0);
            return true;
        }
        else{
            int faltantes = juego_servicio.getPalabra().length - juego_servicio.getLetras_encontradas();
            System.out.println("Número de letras (encontradas, faltantes): (" 
                    + juego_servicio.getLetras_encontradas() + "," + faltantes + ")");
            int oportunidades = juego_servicio.getOportunidades();
            juego_servicio.setOportunidades(oportunidades - 1);
        }
        return false;
    }
    
    public void intentos(boolean encontrada){
        if(!encontrada){
            if(juego_servicio.getOportunidades() == 0)
                System.out.println("Lo sentimos, no hay más oportunidades");
            else 
                System.out.println("Número de oportunidades restantes: " + juego_servicio.getOportunidades());
        }
    }
}
