/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author Archer
 */
public enum Numero {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), TEN(10), ELEVEN(11), TWELVE(12);
    
    private int valor;
    
    private Numero(int valor){
        this.valor = valor;
    }
}
