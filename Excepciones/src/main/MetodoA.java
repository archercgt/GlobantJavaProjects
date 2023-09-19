/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Archer
 */
public class MetodoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodoA();
    }

    public static void metodoA() {
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");
        try {
            System.out.println("sentencia_a3");
            //System.out.println(Integer.parseInt("sentencia_a3"));
            System.out.println(Integer.parseInt("sentencia_a4"));
        } catch (Exception e) {
            System.out.println("sentencia_a6");
        }
        System.out.println("sentencia_a5");
    }
}
