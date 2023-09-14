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
public class MetodoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        C.metodo();
    }

    public static class C {

        public static void metodo()throws NumberFormatException{
            System.out.println("sentencia_c1");
            
            try {
                System.out.println("sentencia_c2");
                //System.out.println(5/0);
                //System.out.println("sentencia_c3");
                System.out.println(Integer.parseInt("w"));
            }catch (ArithmeticException e){
                System.out.println("sentencia_c4");
            }catch(NumberFormatException e){
                System.out.println("sentencia_c5");
                throw (e);
            }finally{
                System.out.println("sentencia_c6");
            }
        }
    }
}
