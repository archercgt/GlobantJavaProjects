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
public class BarcoMotor extends Barco{
    protected double potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(double potencia, String matricula, int eslora, int anio_fabricacion) {
        super(matricula, eslora, anio_fabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public void diligenciarBarco(){
        super.diligenciarBarco();
        System.out.println("Ingrese la potencia del barco");
        potencia = leer.nextDouble();
    }
}
