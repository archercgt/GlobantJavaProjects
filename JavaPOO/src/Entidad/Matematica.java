/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Archer
 */
public class Matematica {
    double num1, num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double devolverMayor(){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    
    public double calcularPotencia(){
        if (num1 > num2)
            return Math.pow(Math.round(num1), Math.round(num2));
        else
            return Math.pow(Math.round(num2), Math.round(num1));
    }
    
    public double calculaRaiz(){
        if (num1 < num2)
            return Math.sqrt(Math.abs(num1));
        else
            return Math.sqrt(Math.abs(num2));
    }
}
