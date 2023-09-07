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
public class Hotel4 extends Hotel{
    protected String gimnasio, nombre_restaurante;
    protected int capacidad_restaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombre_restaurante, int capacidad_restaurante, int cantidad_habitaciones, int num_camas, int pisos, double precio_habitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidad_habitaciones, num_camas, pisos, precio_habitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombre_restaurante = nombre_restaurante;
        this.capacidad_restaurante = capacidad_restaurante;
    }
    

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String Gimnasio) {
        this.gimnasio = Gimnasio;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) {
        this.nombre_restaurante = nombre_restaurante;
    }

    public int getCapacidad_restaurante() {
        return capacidad_restaurante;
    }

    public void setCapacidad_restaurante(int capacidad_restaurante) {
        this.capacidad_restaurante = capacidad_restaurante;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese el tipo de gimnasio A,B");
        gimnasio = leer.next().toUpperCase();
        System.out.println("Ingrese el nombre del restaurante");
        nombre_restaurante = leer.next();
        System.out.println("Ingrese la capacidad del restaurante");
        capacidad_restaurante = leer.nextInt();
    }
    
    
    @Override
    public void calcularPrecioHabitacion(){
        precio_habitacion = 50 + cantidad_habitaciones + valorAgregadoRest() + valorAgregadoGim();
    }
    
    private int valorAgregadoRest(){
        if (capacidad_restaurante < 30)
            return 10;
        else if(capacidad_restaurante >= 30 && capacidad_restaurante <=50)
            return 30;
        else
            return 50;
    }
    
    private int valorAgregadoGim(){
        if(gimnasio.equals("A"))
            return 50;
        else if(gimnasio.equals("B"))
            return 30;
        else 
            return 0;
    }
}
