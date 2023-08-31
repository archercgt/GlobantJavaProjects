/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.calculosFormas;

/**
 *
 * @author Archer
 */
public class Circulo implements calculosFormas{
    private int radio;
    private double area, perimetro;
   
    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
   
    @Override
    public void calcularArea() {
        area = Math.pow(radio, 2) * PI;
        System.out.println("El área del círculo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * PI * radio;
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
