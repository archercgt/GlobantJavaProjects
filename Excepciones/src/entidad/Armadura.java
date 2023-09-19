/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.text.DecimalFormat;


/**
 *
 * @author Archer
 */
public class Armadura {
    private String color_primario, color_secundario;
    private int nivel_resistencia, nivel_salud, bateria;
    private Consola consola;
    private Botas botas;
    private Guantes guantes;
    private Sintetizador sintetizador;

    public Armadura() {
        consola = new Consola(30);
        botas = new Botas(3000);
        guantes = new Guantes(2000);
        sintetizador = new Sintetizador(20);
        bateria = Integer.MAX_VALUE;
    }
    
    
    public void caminar(int tiempo){
        bateria -= botas.usar(1, tiempo);
    }
    
    public void correr(int tiempo){
        bateria -= botas.usar(2, tiempo);
    }
    
    public void propulsar(int tiempo){
        bateria -= botas.usar(3, tiempo);
    }
    
    public void volar(int tiempo){
        bateria -= botas.usar(3, tiempo);
        bateria -= guantes.usar(2, tiempo);
    }
    
    public void escribir(int tiempo){
        bateria -= consola.usar(1, tiempo);
    }
    
    public void leer(int tiempo){
        bateria -= sintetizador.usar(1, tiempo);
    }

    public String getColor_primario() {
        return color_primario;
    }

    public void setColor_primario(String color_primario) {
        this.color_primario = color_primario;
    }

    public String getColor_secundario() {
        return color_secundario;
    }

    public void setColor_secundario(String color_secundario) {
        this.color_secundario = color_secundario;
    }

    public int getNivel_resistencia() {
        return nivel_resistencia;
    }

    public void setNivel_resistencia(int nivel_resistencia) {
        this.nivel_resistencia = nivel_resistencia;
    }

    public int getNivel_salud() {
        return nivel_salud;
    }

    public void setNivel_salud(int nivel_salud) {
        this.nivel_salud = nivel_salud;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    public void mostrarEstado(){
        String estado =  "Armadura{" + "color_primario=" + color_primario + ", color_secundario=" + color_secundario + 
                ", nivel_resistencia=" + nivel_resistencia + ", nivel_salud=" + nivel_salud + ", bateria=" + 
                bateria + "W-min" + ", consumo_consola=" + consola.getConsumo_energia() + "W" + ", consumo_botas=" + 
                botas.getConsumo_energia() + "W" +", consumo_guantes=" + guantes.getConsumo_energia() + "W" + 
                ", consumo_sintetizador=" + sintetizador.getConsumo_energia() + "W" + '}';
        System.out.println("A continuación se presenta el estado de la armadura");
        System.out.println(estado);
        System.out.println("");
    }
    
    public void mostrarEstadoBateria(){
        System.out.println("A continuación se presenta el estado de la batería");
        double estado = ((double) bateria/Integer.MAX_VALUE) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        String estado_formato = df.format(estado);
        System.out.println("Estado bateria: " + estado_formato + "%");
        System.out.println("");
    }
    

}
