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
public class Polideportivo extends Edificio{
    protected String nombre, techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String Techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = Techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTechado() {
        return techado;
    }

    public void setTechado(String Techado) {
        this.techado = Techado;
    }
    
    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: " + (alto * ancho * alto) + " metros cubicos");
    }
    
    @Override
    public void crearEdificio(){
        super.crearEdificio();
        System.out.println("Ingrese el nombre del polideportivo");
        nombre = leer.next();
        System.out.println("Ingrese el techado");
        techado = leer.next().toLowerCase();
    }
}
