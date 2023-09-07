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
public class Hotel5 extends Hotel4{
    private int salones, suites, limosinas;

    public Hotel5() {
    }

    public Hotel5(int salones, int suites, int limosinas, String gimnasio, String nombre_restaurante, int capacidad_restaurante, int cantidad_habitaciones, int num_camas, int pisos, double precio_habitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombre_restaurante, capacidad_restaurante, cantidad_habitaciones, num_camas, pisos, precio_habitacion, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }
    
    

    public int getSalones() {
        return salones;
    }

    public void setSalones(int salones) {
        this.salones = salones;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }
    
    @Override
    public void crearAlojamiento(){
        super.crearAlojamiento();
        System.out.println("Ingrese la cantidad de salones");
        salones = leer.nextInt();
        System.out.println("Ingrese la cantidad de suites");
        suites = leer.nextInt();
        System.out.println("Ingrese la cantidad de limosinas");
        limosinas = leer.nextInt();
    }
    
    @Override
    public void calcularPrecioHabitacion(){
        super.calcularPrecioHabitacion();
        precio_habitacion += valorAgregadoLimo();
       
    }
    
    private int valorAgregadoLimo(){
        return (15 * limosinas);
    }
    
}
