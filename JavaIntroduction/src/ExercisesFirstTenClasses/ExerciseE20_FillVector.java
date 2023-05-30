/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

/**
 *
 * @author Archer
 */
public class ExerciseE20_FillVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[5];
        llenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void llenarVector(int[] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*10);
        }
    }
    
    public static void imprimirVector(int[] vector){
        System.out.println("El vector es:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }  
}
