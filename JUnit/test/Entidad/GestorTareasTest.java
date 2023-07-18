/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
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
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }
    
    GestorTareas instance;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new GestorTareas();
        instance.agregarTarea("Tarea de prueba");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarTarea method, of class GestorTareas.
     */
    @Test
    public void testAgregarTarea() {
        System.out.println("agregarTarea");
        String tarea = "Se requiere crear un nuevo código para un gestor de tareas";
        instance.agregarTarea(tarea);
    }

    /**
     * Test of eliminarTarea method, of class GestorTareas.
     */
    @Test
    public void testEliminarTarea() {
        System.out.println("eliminarTarea");
        String tarea = "Utilizar JUnit";
        instance.eliminarTarea(tarea);
    }

    /**
     * Test of listarTareas method, of class GestorTareas.
     */
    @Test
    public void testListarTareas() {
        System.out.println("listarTareas");
        instance.listarTareas();
    }
}
