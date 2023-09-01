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
public class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, int eslora, int anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public void diligenciarBarco(){
        super.diligenciarBarco();
        System.out.println("Ingrese el numero de mástiles con que cuenta el barco");
        mastiles = leer.nextInt();
    }
}
