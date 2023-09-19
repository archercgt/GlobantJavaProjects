/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Random;

/**
 *
 * @author Archer
 */
public class Dispositivo {

    protected int consumo_energia;
    protected boolean averiado;

    public Dispositivo() {
    }

    public Dispositivo(int consumo_energia) {
        this.consumo_energia = consumo_energia;
        averiado = false;
    }

    public int getConsumo_energia() {
        return consumo_energia;
    }

    public void setConsumo_energia(int consumo_energia) {
        this.consumo_energia = consumo_energia;
    }

    public int usar(int intensidad, int tiempo) {
        if (averiado) {
            averiado = simularProbabilidad(60);
            if (averiado) {
                System.out.println("No es posible realizar la acción por que un dispositivo se encuentra averiado");
                return 0;
            } else {
                int energia = intensidad * consumo_energia * tiempo;
                averiado = simularProbabilidad(30);
                return energia;
            }
        } else {
            int energia = intensidad * consumo_energia * tiempo;
            averiado = simularProbabilidad(30);
            return energia;
        }
    }

    private boolean simularProbabilidad(int porcentaje) {
        Random random = new Random();
        int numero_aleatorio = random.nextInt(100) + 1;
        if (numero_aleatorio < porcentaje) {
            return true;
        } else {
            return false;
        }
    }

}
