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
public class MetodoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodoB();
    }

    public static void metodoB() {
        System.out.println("sentencia_b1");
        try {
            System.out.println("sentencia_b2");
            //System.out.println(Integer.parseInt("sentencia_b2"));
        } catch (Exception e) {
            System.out.println("sentencia_b3");
        } finally {
            System.out.println("sentencia_b4");
        }
    }
}
