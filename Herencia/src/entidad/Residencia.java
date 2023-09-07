/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Archer
 */
public class Residencia extends ExtraHotelero{
    private int cant_habitaciones;
    private boolean descuento, campo_deportivo;

    public Residencia() {
    }

    public Residencia(int cant_habitaciones, boolean descuento, boolean campo_deportivo, boolean privado, int metros_cuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros_cuadrados, nombre, direccion, localidad, gerente);
        this.cant_habitaciones = cant_habitaciones;
        this.descuento = descuento;
        this.campo_deportivo = campo_deportivo;
    }

    public int getCant_habitaciones() {
        return cant_habitaciones;
    }

    public void setCant_habitaciones(int cant_habitaciones) {
        this.cant_habitaciones = cant_habitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampo_deportivo() {
        return campo_deportivo;
    }

    public void setCampo_deportivo(boolean campo_deportivo) {
        this.campo_deportivo = campo_deportivo;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de habitaciones");
        cant_habitaciones = leer.nextInt();
        System.out.println("Indique si hacen descuento a los gremios s/n");
        String respuesta = leer.next().toLowerCase();
        if (respuesta.equals("s"))
            descuento = true;
        if (respuesta.equals("n"))
            descuento = false;
        System.out.println("Indique si la residencia cuenta con campo deportivo s/n");
        respuesta = leer.next().toLowerCase();
        if(respuesta.equals("s"))
            campo_deportivo = true;
        if (respuesta.equals("n"))
            campo_deportivo = false;       
    }
}
