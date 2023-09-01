/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class Alquiler<T> {

    private String nombre;
    private int documento;
    private LocalDate fecha_alquiler;
    private LocalDate fecha_devolucion;
    private String posicion_amarre;
    private Barco barco;
    private Scanner leer;

    public Alquiler() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alquiler(String nombre, int documento, LocalDate fecha_alquiler, LocalDate fecha_devolucion, String posicion_amarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fecha_alquiler = fecha_alquiler;
        this.fecha_devolucion = fecha_devolucion;
        this.posicion_amarre = posicion_amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(LocalDate fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getPosicion_amarre() {
        return posicion_amarre;
    }

    public void setPosicion_amarre(String posicion_amarre) {
        this.posicion_amarre = posicion_amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void calcularAlquiler() {
        System.out.println("Ingrese una de las siguientes opciones segun el tipo de barco");
        System.out.println("1 velero");
        System.out.println("2 Barco con motor");
        System.out.println("3 Yate");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                barco = new Velero();
                break;
            case 2:
                barco = new BarcoMotor();
                break;
            case 3:
                barco = new Yate();
                break;
            default:
                System.out.println("La opción ingresada no es correcta");
        }
        barco.diligenciarBarco();
        diligenciarAlquiler();
        System.out.println(fecha_alquiler);
        System.out.println(fecha_devolucion);
        long dias = ChronoUnit.DAYS.between(fecha_alquiler, fecha_devolucion);
        int modulo = calcularModulo();
        int alquiler = (int)dias * modulo;
        System.out.println("Dias del alquiler: " + dias);
        System.out.println("El costo del alquiler es: $" + alquiler);
    }

    public void diligenciarAlquiler() {
        System.out.println("Ingrese el nombre de la persona que alquilará el amarre");
        nombre = leer.next();
        System.out.println("ingrese el documento de la persona que alquilará el amarre");
        documento = leer.nextInt();
        System.out.println("Ingrese la posición donde quedará el barco");
        posicion_amarre = leer.next();
        System.out.println("Ingrese la fecha de alquiler en el formato AAAA-MM-DD");
        String alquiler_str = leer.next();
        System.out.println("Ingrese la fecha de devolución en el formato AAA-MM-DD");
        String devolucion_str = leer.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha_alquiler = LocalDate.parse(alquiler_str, formatter);
        fecha_devolucion = LocalDate.parse(devolucion_str, formatter);
    }
    
    public int calcularModulo(){
        int modulo = 10 * barco.getEslora();
        
        if (barco instanceof Velero){
            modulo += ((Velero)barco).getMastiles();
        }
        if(barco instanceof BarcoMotor){
            modulo += ((BarcoMotor)barco).getPotencia();
        }
        if(barco instanceof Yate){
            modulo += ((Yate)barco).getPotencia();
            modulo += ((Yate)barco).getCamarotes();
        }
        return modulo;
    }
}
