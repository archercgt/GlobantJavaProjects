/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Archer
 */
public class EdificioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Edificio> edificios = new ArrayList();
        edificios.add(new Polideportivo());
        edificios.add(new Polideportivo());
        edificios.add(new EdificioDeOficinas());
        edificios.add(new EdificioDeOficinas());
        int techados = 0;
        int abiertos = 0;
        
        for(Edificio edificio: edificios){
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                polideportivo.crearEdificio();
                if(polideportivo.getTechado().equals("techado")){
                    techados += 1;
                }
                if(polideportivo.getTechado().equals("abierto")){
                    abiertos += 1;
                }
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.crearEdificio();
                edificioDeOficinas.cantPersonas();
            }
            edificio.calcularSueprficie();
            edificio.calcularVolumen();
        }
        System.out.println("La cantidad de polideportivos techados es: " + techados);
        System.out.println("La cantidad de polideportivos abiertos es: " + abiertos);
    }
}
