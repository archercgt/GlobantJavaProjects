/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enumeracion.Numero;
import enumeracion.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Archer
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private Iterator<Carta> iterator;
    private int cartas_restantes;
    private ArrayList<Carta> cartas_salieron;

    public Baraja() {
        cartas = new ArrayList();
        cartas_salieron = new ArrayList();
        cartas_restantes = 40;
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void barajar(){
        for (Palo aux_palo: Palo.values()){
            for(Numero aux_numero: Numero.values()){
                cartas.add(new Carta(aux_numero, aux_palo));
            }
        }
        Collections.shuffle(cartas);
        //for(Carta carta: cartas){
          //  System.out.println(carta);
        //}
        iterator = cartas.iterator();
    }
    
    public void siguienteCarta(){
        if(iterator.hasNext()){
            Carta carta = iterator.next();
            System.out.println(carta);
            cartas_salieron.add(carta);
            cartas_restantes -= 1;
        }
        else{
            System.out.println("No hay mas cartas");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Aún se pueden repartir " + cartas_restantes + " cartas.");
    }
    
    
    public void darCartas(int num_cartas){
        System.out.println("Dar " + num_cartas + " cartas" );
        if (num_cartas < cartas_restantes){
            for(int i = 1; i <= num_cartas; i++){
                siguienteCarta();
            }
        }else{
            System.out.println("No hay la cantidad de cartas solicitas");
        }
    }
    
    public void cartasMonton(){
        if (cartas_salieron.isEmpty()){
            System.out.println("No ha salido ninguna carta");
        }else{
            System.out.println("Las cartas que ya salieron son las siguientes:");
            for(Carta carta: cartas_salieron){
                System.out.println(carta);
            }
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Mostrar baraja");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    } 
}
