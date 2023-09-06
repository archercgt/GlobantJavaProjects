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
public class EdificioDeOficinas extends Edificio{
    
    protected int num_oficinas, personas_oficina, num_pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int num_oficinas, int personas_oficina, int num_pisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.num_oficinas = num_oficinas;
        this.personas_oficina = personas_oficina;
        this.num_pisos = num_pisos;
    }

    public int getNum_oficinas() {
        return num_oficinas;
    }

    public void setNum_oficinas(int num_oficinas) {
        this.num_oficinas = num_oficinas;
    }

    public int getPersonas_oficina() {
        return personas_oficina;
    }

    public void setPersonas_oficina(int personas_oficina) {
        this.personas_oficina = personas_oficina;
    }

    public int getNum_pisos() {
        return num_pisos;
    }

    public void setNum_pisos(int num_pisos) {
        this.num_pisos = num_pisos;
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: " + (alto * ancho * alto * num_pisos) + " metros cubicos");
    }
    
    @Override
    public void crearEdificio(){
        super.crearEdificio();
        System.out.println("Ingresar el numero de oficinas");
        num_oficinas = leer.nextInt();
        System.out.println("Ingrese el numero de personas por oficina");
        personas_oficina = leer.nextInt();
        System.out.println("Ingrese el numero de pisos");
        num_pisos = leer.nextInt();
    }
    
    public void cantPersonas(){
        System.out.println("La cantidad de personas por piso son: " + personas_oficina);
        System.out.println("La cantidad de personas en el edificio son: " + (personas_oficina * num_pisos));
    }
}
