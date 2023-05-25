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
public class ExerciseE2_Exchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 1, B = 2, C = 3, D = 4, aux;
        System.out.println("Los valores iniciales de las variables son:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Los valores finales de las variables son:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
    
}
