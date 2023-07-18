/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author Archer
 */
public class TemperaturaService {
    public double convertirCelsiusAFahrenheit(double temperatura){
        return (temperatura * 1.8) + 32;
    }
    public double convertirFahrenheitACelsius(double temperatura){
        return (temperatura - 32) /1.8;
    }
}
