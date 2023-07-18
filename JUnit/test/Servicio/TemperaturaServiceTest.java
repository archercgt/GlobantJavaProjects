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
public class TemperaturaServiceTest {
    
    public TemperaturaServiceTest() {
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
     * Test of convertirCelsiusAFahrenheit method, of class TemperaturaService.
     */
    @Test
    public void testConvertirCelsiusAFahrenheit() {
        System.out.println("convertirCelsiusAFahrenheit");
        double temperatura = 24;
        TemperaturaService instance = new TemperaturaService();
        double expResult = 75.2;
        double result = instance.convertirCelsiusAFahrenheit(temperatura);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of convertirFahrenheitACelsius method, of class TemperaturaService.
     */
    @Test
    public void testConvertirFahrenheitACelsius() {
        System.out.println("convertirFahrenheitACelsius");
        double temperatura = 68;
        TemperaturaService instance = new TemperaturaService();
        double expResult = 20;
        double result = instance.convertirFahrenheitACelsius(temperatura);
        assertEquals(expResult, result, 0.0);
    }
    
}
