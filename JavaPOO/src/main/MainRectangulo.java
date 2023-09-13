/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author Archer
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloService rec_servicio = new RectanguloService();
        Rectangulo rect = rec_servicio.crearRectangulo();
        rec_servicio.area(rect);
        rec_servicio.perimetro(rect);
        rec_servicio.dibujarRectangulo(rect);
    }
    
}
