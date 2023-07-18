/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class ValidadorFechaTest {
    
    public ValidadorFechaTest() {
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
     * Test of validarFecha method, of class ValidadorFecha.
     */
    @Test
    public void testFechaInvalida() {
        System.out.println("validarFecha");
        int anio = 2023;
        int mes = 15;
        int dia = 5;
        ValidadorFecha instance = new ValidadorFecha();
        boolean expResult = false;
        boolean result = instance.validarFecha(anio, mes, dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFechaValida() {
        System.out.println("validarFecha");
        int anio = 2023;
        int mes = 7;
        int dia = 18;
        ValidadorFecha instance = new ValidadorFecha();
        boolean expResult = true;
        boolean result = instance.validarFecha(anio, mes, dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAnioBisiesto() {
        System.out.println("validarFecha");
        int anio = 2024;
        int mes = 2;
        int dia = 29;
        ValidadorFecha instance = new ValidadorFecha();
        boolean expResult = true;
        boolean result = instance.validarFecha(anio, mes, dia);
        assertEquals(expResult, result);
    }
}
