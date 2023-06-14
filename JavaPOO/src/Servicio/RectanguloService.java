/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class RectanguloService {
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rect = new Rectangulo();
        System.out.println("Ingrese la altura del rectangulo");
        rect.setAltura(leer.nextInt());
        System.out.println("Ingrese la base del rectangulo");
        rect.setBase(leer.nextInt());
        leer.close();
        return rect;
    }
    
    public void area(Rectangulo rect){
        System.out.println("El área del rectangulo es: " + rect.getAltura() * rect.getBase());
    }
    
    public void perimetro(Rectangulo rect){
        System.out.println("El perimetro del rectangulo es: " + (2 * rect.getAltura() + 2* rect.getBase()) );
    }
    
    public void dibujarRectangulo(Rectangulo rect){
        System.out.println("La figura del rectangulo es: ");
        for(int i = 0; i < rect.getAltura(); i++){
            for(int j = 0; j < rect.getBase(); j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}