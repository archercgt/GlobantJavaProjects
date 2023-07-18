/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.regex.*;

/**
 *
 * @author Archer
 */
public class ContrasenaService {
    
    public boolean validarContrasena(String contrasena){
        boolean valida = true;
        // Regular expression pattern to match any special character
        String regex = "[^a-zA-Z0-9]";
        String regex2 = "[A-Z]";
        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        // Create a Matcher object to find matches
        Matcher matcher = pattern.matcher(contrasena);
        Matcher matcher2 = pattern.matcher(contrasena);
        if (contrasena.length() < 8){
            valida = false;
        }
        if(!matcher.find()){
            valida = false;
        }
        if(!matcher2.find()){
            valida = false;
        }
        return valida;
    }
}
