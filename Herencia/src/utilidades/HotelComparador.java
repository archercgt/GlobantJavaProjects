/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Hotel;
import java.util.Comparator;

/**
 *
 * @author Archer
 */
public class HotelComparador {
    public static Comparator<Hotel> ordenarPrecioDesc = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return Double.valueOf(t1.getPrecio_habitacion()).compareTo(t.getPrecio_habitacion());
        }
    };
    
}
