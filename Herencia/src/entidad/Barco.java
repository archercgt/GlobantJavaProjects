/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Archer
 */
public abstract class Barco {
    protected String matricula;
    protected int eslora;
    protected int anio_fabricacion;
    protected Scanner leer;

    public Barco() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Barco(String matricula, int eslora, int anio_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }
    
    public void diligenciarBarco(){
        System.out.println("Ingrese la matrícula");
        matricula = leer.next();
        System.out.println("Ingrese los metros de eslora con que cuenta el barco");
        eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricación del barco");
        anio_fabricacion = leer.nextInt();
    }
}
