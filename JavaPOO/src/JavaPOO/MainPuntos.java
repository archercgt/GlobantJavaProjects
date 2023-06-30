/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Puntos;
import Servicio.PuntosService;

/**
 *
 * @author Archer
 */
public class MainPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosService puntos_servicio = new PuntosService();
        Puntos mis_puntos = puntos_servicio.crearPuntos();
        System.out.println("La distancia entre los puntos ingresados es: " 
                + puntos_servicio.calcularDistancia(mis_puntos));
    }
}
