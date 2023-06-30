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
public class Ahorcado {
    private char [] palabra;
    private int letras_encontradas;
    private int oportunidades;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letras_encontradas, int jugadas_maximas) {
        this.palabra = palabra;
        this.letras_encontradas = letras_encontradas;
        this.oportunidades = jugadas_maximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras_encontradas() {
        return letras_encontradas;
    }

    public void setLetras_encontradas(int letras_encontradas) {
        this.letras_encontradas = letras_encontradas;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
}
