/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPOO;

import Entidad.Cuenta;
import Servicio.CuentaService;

/**
 *
 * @author Archer
 */
public class MainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaService cta_servicio = new CuentaService();
        Cuenta cta = cta_servicio.crearCuenta();
        cta_servicio.ingresar(15000, cta);
        cta_servicio.retirar(1000, cta);
        cta_servicio.extraccionRapida(2000, cta);
        cta_servicio.consultarSaldo(cta);
        cta_servicio.consultarDatos(cta);
    }
}