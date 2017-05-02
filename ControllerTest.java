/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AdDiS
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of loadVisualization method, of class Controller.
     */
    @Test
    public void testLoadVisualization() {
        System.out.println("loadVisualization");
        boolean[][] currentMove = { { true, false, false, true },
                                    { false, true, true ,false },
                                    { false, true, true ,false },
                                    { true,false, false, true  }};
        Controller instance = new Controller();
        instance.loadVisualization(currentMove);
        
        assertNotSame(currentMove, instance);
    }
    /**
     * Test of FileImport method, of class Controller.
     */
    @Test
    public void testFileImport() {
        System.out.println("FileImport");
        ActionEvent e = null;
        Controller instance = new Controller();
        assertEquals(null,instance.fileImport);
    }
    
    /**
     * Test of slowButton method, of class Controller.
     */
    @Test
    public void testSlowButton() {
        System.out.println("slowButton");
        ActionEvent e = null;
        Controller instance = new Controller();
        double expResult = 6.0;
        double result = instance.slowButton(e);
        assertEquals(expResult, result, 6.0);
    }

    /**
     * Test of normalButton method, of class Controller.
     */
   @Test
    public void testNormalButton() {
        System.out.println("normalButton");
        ActionEvent e = null;
        Controller instance = new Controller();
        double expResult = 6.0;
        double result = instance.normalButton(e);
        assertEquals(expResult, result, 6.0);
    }

    /**
     * Test of fastButton method, of class Controller.
     */
   @Test
    public void testFastButton() {
        System.out.println("fastButton");
        ActionEvent e = null;
        Controller instance = new Controller();
        double expResult = 5.0;
        double result = instance.fastButton(e);
        assertEquals(expResult, result, 5.0);
    }

    /**
     * Test of SpeedBar method, of class Controller.
     */
   @Test
    public void testSpeedBar() {
        System.out.println("SpeedBar");
        MouseEvent event = null;
        Controller instance = new Controller();
        assertEquals(null, instance.speedBar);
    }
    /**
     * Test of GridBar method, of class Controller.
     */
    @Test
    public void testGridBar() {
        System.out.println("GridBar");
        MouseEvent event = null;
        Controller instance = new Controller();
        assertEquals(null, instance.gridBar);
    }

    /**
     * Test of startButton method, of class Controller.
     */
    @Test
    public void testStartButton() {
        System.out.println("startButton");
        ActionEvent event = null;
        Controller instance = new Controller();
        assertEquals(null, instance.start);
    }

    /**
     * Test of resetButton method, of class Controller.
     */
    @Test
    public void testResetButton() {
        System.out.println("resetButton");
        ActionEvent event = null;
        Controller instance = new Controller();
        assertEquals(null, instance.reset);
    }

    /**
     * Test of rulesButton method, of class Controller.
     */
    @Test
    public void testRulesButton() {
        System.out.println("rulesButton");
        ActionEvent event = null;
        Controller instance = new Controller();
        assertEquals(null, instance.rules);
    }

    /**
     * Test of RandomGeneration method, of class Controller.
     */
    @Test
    public void testRandomGeneration() {
        System.out.println("RandomGeneration");
        Random G = new Random();
        boolean random = G.nextBoolean();
        Controller instance = new Controller();
        assertNotSame(G,instance.random);
    }
}

