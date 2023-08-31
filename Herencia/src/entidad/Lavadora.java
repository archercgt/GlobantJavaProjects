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
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, int peso, String color, String consume_energetico) {
        super(precio, peso, color, consume_energetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        carga = leer.nextInt();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga > 30){
            super.agregarPrecio(500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", carga=" + carga + '}';
    }
    
}
