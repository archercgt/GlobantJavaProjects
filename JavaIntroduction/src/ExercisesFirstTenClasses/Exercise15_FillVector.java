/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercisesFirstTenClasses;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Exercise15_FillVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        llenar();
        
    }
    
    public static void llenar(){
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++){
            vector[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--){
            System.out.println(vector[i]);
        }
    }
}