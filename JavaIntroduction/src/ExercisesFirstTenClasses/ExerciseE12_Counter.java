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
public class ExerciseE12_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unidades = 0, decenas = 0, centenas = 0, contador =0;
        String uString, dString, cString;
        while (contador < 1000){
            uString = String.valueOf(unidades);
            dString = String.valueOf(decenas);
            cString = String.valueOf(centenas);
            if(uString.equals("3")){
                uString = "E";
            }
            if(dString.equals("3")){
                dString = "E";
            }
            if(cString.equals("3")){
                cString = "E";
            }
            System.out.println(cString + "-" + dString + "-" + uString);
            unidades++;
            if (unidades == 10){
                unidades = 0;
                decenas++;
            }
            if (decenas == 10){
                decenas = 0;
                centenas++;
            }
            contador++;
        }
    }
}