/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.GregorianCalendar;

/**
 *
 * @author Archer
 */
public class ValidadorFecha {
    public boolean validarFecha(int anio, int mes, int dia) {
        if (anio < 0 || mes <= 0 || mes > 12) {
            return false;
        }
        // Create a GregorianCalendar object with the specified year, month, and day
        GregorianCalendar gregorianCalendar = new GregorianCalendar(anio, mes, 1);
        // Check if the day is within the valid range for the specified month
        return dia >= 1 && dia <= gregorianCalendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }
}