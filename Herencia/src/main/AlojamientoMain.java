/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Alojamiento;
import entidad.Camping;
import entidad.Hotel;
import entidad.Hotel4;
import entidad.Hotel5;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.HotelComparador;

/**
 *
 * @author Archer
 */
public class AlojamientoMain {

    public static ArrayList<Alojamiento> alojamientos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        alojamientos.add(new Hotel4("A", "El rancherito", 50, 25, 50, 3, 0, "Hotel 4", "dir1", "loc1", "ger1"));
        alojamientos.add(new Hotel5(3, 4, 2, "A", "La cocinita", 80, 40, 80, 1, 0, "Hotel 5", "dir2", "loc2", "ger2"));
        alojamientos.add(new Camping(30, 10, true, true, 2000, "La cabañita", "dir3", "loc3", "ger3"));
        alojamientos.add(new Camping(30, 10, false, false, 2000, "La cabañita2", "dir4", "loc4", "ger4"));
        alojamientos.add(new Residencia(10, true, true, true, 1000, "Residencia", "dir5", "loc5", "ger5"));
        alojamientos.add(new Residencia(10, false, false, false, 1000, "Residencia2", "dir6", "loc6", "ger6"));

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4) {
                Hotel4 hotel4 = (Hotel4) alojamiento;
                hotel4.calcularPrecioHabitacion();
            }
            if (alojamiento instanceof Hotel5) {
                Hotel5 hotel5 = (Hotel5) alojamiento;
                hotel5.calcularPrecioHabitacion();
            }
        }

        do {
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("1 Listar todos los alojamientos");
            System.out.println("2 Listar los hoteles del mas caro al mas barato");
            System.out.println("3 Listar los camping con restaurante");
            System.out.println("4 Listar residencias con descuento");
            System.out.println("5 Salir");
            int opcions = leer.nextInt();
            switch (opcions) {
                case 1:
                    listarAlojamientos();
                    break;
                case 2:
                    listarHoteles();
                    break;
                case 3:
                    listarCampings();
                    break;
                case 4:
                    listarResidencias();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("La opción ingresada es invalida");

            }
        } while (continuar);

        leer.close();

    }

    public static void listarAlojamientos() {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
        System.out.println("");
    }

    public static void listarHoteles() {
        System.out.println("El listado de hoteles es:");
        ArrayList<Hotel> hoteles = new ArrayList();
        for(Alojamiento alojamiento: alojamientos){
            if (alojamiento instanceof Hotel) {
                Hotel hotel = (Hotel) alojamiento;
                hoteles.add(hotel);
            }
        }
        Collections.sort(hoteles, HotelComparador.ordenarPrecioDesc);
        for(Hotel hotel: hoteles){
            System.out.println(hotel + "con un costo por habitación de $" + hotel.getPrecio_habitacion());
        }
    }

    public static void listarCampings() {
        System.out.println("Lista de campings con restaurante:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if(camping.isRestaurante())
                    System.out.println(camping);
            }
        }
        System.out.println("");
    }

    public static void listarResidencias() {
        System.out.println("Lista de residencias con descuento:");
        for(Alojamiento alojamiento: alojamientos){
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if(residencia.isDescuento())
                    System.out.println(residencia);
            }
        }
    }
}
