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
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public int mostrarVocales(){
        int vocales = 0;
        for (int i = 0; i < longitud; i++){
            if (frase.toLowerCase().charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                vocales += 1;
            }
        }
        return vocales;
    }
    
    public String invertirFrase(){
        StringBuilder reversedStr = new StringBuilder(frase).reverse();
        String fraseInvertida = reversedStr.toString();
        return fraseInvertida;
    }
    
    public int vecesRepetido(char letra){
        int repeticiones = 0;
        for (int i = 0; i < longitud; i++){
            if(frase.charAt(i)== letra){
               repeticiones += 1; 
            }
        }
        return repeticiones;
    }
    
    public String compararLongitud(String frase){
        if(longitud > frase.length()){
            return "La frase de la clase es más larga";
        }
        else if(longitud < frase.length()){
            return "La frase de la clase es mas corta";
        }
        else
            return "Ambas frases tienen igual longitud";
    }
    
    public String unirFrases(String frase){
        return this.frase + " " + frase;
    }
    
    public String reemplazar(String letra){
        String result = "";
        for (int i = 0; i < longitud; i++){
            if(frase.charAt(i)== 'a'){
                result += letra;
            }
            else{
                result += Character.toString(frase.charAt(i));
            }
        }
        return result;
    }
    
    public boolean contiene(String letra){
        boolean isLetterPresent = frase.contains(letra);
        return isLetterPresent;
    }
    
}