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
public class ContrasenaServiceTest {
    
    public ContrasenaServiceTest() {
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
     * Test of validarContrasena method, of class ContrasenaService.
     */
    @Test
    public void testValidarContrasena() {
        System.out.println("validarContrasena");
        String contrasena = "Esgryh6!";
        ContrasenaService instance = new ContrasenaService();
        boolean expResult = true;
        boolean result = instance.validarContrasena(contrasena);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarContrasenaInvalida() {
        System.out.println("validarContrasena");
        String contrasena = "carro";
        ContrasenaService instance = new ContrasenaService();
        boolean expResult = false;
        boolean result = instance.validarContrasena(contrasena);
        assertEquals(expResult, result);
    }
}
