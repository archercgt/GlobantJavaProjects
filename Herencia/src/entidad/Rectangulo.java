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
public class Rectangulo implements calculosFormas{
    private int base, altura;
    private double area, perimetro;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        area = base * altura;
        System.out.println("El área del rectánculo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (base + altura);
        System.out.println("El perímetro del rectánglo es: " + perimetro);
    }
}
