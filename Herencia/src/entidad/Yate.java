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
public class Yate extends BarcoMotor{
    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, double potencia, String matricula, int eslora, int anio_fabricacion) {
        super(potencia, matricula, eslora, anio_fabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public void diligenciarBarco(){
        super.diligenciarBarco();
        System.out.println("Ingrese la cantidad de camarotes con que cuenta el barco");
        camarotes = leer.nextInt();
    }
    
}
