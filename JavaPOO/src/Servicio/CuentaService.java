/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import java.util.Scanner;

/**
 *
 * @author Archer
 */
public class CuentaService {
    public Cuenta crearCuenta(){
       Scanner leer = new Scanner(System.in);
       Cuenta cta = new Cuenta();
       System.out.println("Ingrese el numero de la cuenta");
       cta.setNumeroCuenta(leer.nextInt());
       System.out.println("Ingrese el dni");
       cta.setDni(leer.nextInt());
       System.out.println("Ingrese el saldo inicial");
       cta.setSaldo_actual(leer.nextInt());
       leer.close();
       return cta;
    }
    
    public void ingresar(double ingreso, Cuenta cta){
        cta.setSaldo_actual(cta.getSaldo_actual() + ingreso);
    }
    
    public void retirar(double retiro, Cuenta cta){
        if (retiro > cta.getSaldo_actual()){
            cta.setSaldo_actual(0);
        }
        else{
            cta.setSaldo_actual(cta.getSaldo_actual() - retiro );
        }
    }
    
    public void extraccionRapida(double retiro, Cuenta cta){
        if (retiro > cta.getSaldo_actual() * 0.2){
            System.out.println("No es posible retirar más del 20% del saldo actual");
        }
        else{
            cta.setSaldo_actual(cta.getSaldo_actual() - retiro);
        }
    }
    
    public void consultarSaldo(Cuenta cta){
        System.out.println("El saldo actual de la cuenta es: " + cta.getSaldo_actual());
    }
    
    public void consultarDatos(Cuenta cta){
            System.out.println("La información de la cuenta es: ");
        System.out.println(cta);
    }
}