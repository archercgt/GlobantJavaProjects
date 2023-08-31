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
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, int precio, int peso, String color, String consume_energetico) {
        super(precio, peso, color, consume_energetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas");
        resolucion = leer.nextInt();
        System.out.println("Indique si el televisor tiene sintonizador s/n");
        String input = leer.next().toLowerCase();
        if (input.equals("s")) {
            sintonizador = true;
        } else {
            sintonizador = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio += (precio * 0.3);
        }
        if (sintonizador) {
            precio += 500;
        }
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
   
}
