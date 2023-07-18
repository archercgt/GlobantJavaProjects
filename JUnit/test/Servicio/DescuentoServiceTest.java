/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Archer
 */
public class DescuentoServiceTest {
    
    public DescuentoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularDescuento method, of class DescuentoService.
     */
    @Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
        double precio = 500;
        int descuento = 10;
        DescuentoService instance = new DescuentoService();
        double expResult = 50;
        double result = instance.calcularDescuento(precio, descuento);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularDescuentoMaximo() {
        System.out.println("calcularDescuentoMaximo");
        double precio = 500;
        int descuento = 50;
        DescuentoService instance = new DescuentoService();
        double expResult = 250;
        double result = instance.calcularDescuento(precio, descuento);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularSinDescuento() {
        System.out.println("calcularSinDescuento");
        double precio = 500;
        int descuento = 0;
        DescuentoService instance = new DescuentoService();
        double expResult = 0;
        double result = instance.calcularDescuento(precio, descuento);
        assertEquals(expResult, result, 0.0);
    }
}
