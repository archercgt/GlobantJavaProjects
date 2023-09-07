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
public class Camping extends ExtraHotelero{
    private int capacidad_carpas, cant_banios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidad_carpas, int cant_banios, boolean restaurante, boolean privado, int metros_cuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros_cuadrados, nombre, direccion, localidad, gerente);
        this.capacidad_carpas = capacidad_carpas;
        this.cant_banios = cant_banios;
        this.restaurante = restaurante;
    }

    public int getCapacidad_carpas() {
        return capacidad_carpas;
    }

    public void setCapacidad_carpas(int capacidad_carpas) {
        this.capacidad_carpas = capacidad_carpas;
    }

    public int getCant_banios() {
        return cant_banios;
    }

    public void setCant_banios(int cant_banios) {
        this.cant_banios = cant_banios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la capacidad de carpas");
        capacidad_carpas= leer.nextInt();
        System.out.println("ingrese la cantidad de baños disponibles");
        cant_banios = leer.nextInt();
        System.out.println("Indique si el camping tiene restaurante interno s/n");
        String respuesta = leer.next().toLowerCase();
        if(respuesta.equals("s"))
            restaurante = true;
        if(respuesta.equals("n"))
            restaurante = false;
    }
    
}
