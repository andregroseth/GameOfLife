/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
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
public class GOL_MainTest {
    
    public GOL_MainTest() {
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
     * Test of start method, of class GOL_Main.
     * @throws java.lang.InterruptedException
     */

    @Test
    public void testStart() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JFXPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            new GOL_Main().start(new Stage()); // Create and
                            // initialize app
                        } catch (Exception ex) {
                            Logger.getLogger(GOL_MainTest.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                });
            }
        });
        thread.start();// Initialize the thread
        Thread.sleep(10);
        System.out.println("start");
        Stage stage = null;
        GOL_Main instance = new GOL_Main();                  
    }
    /**
     * Test of main method, of class GOL_Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GOL_Main.main(args);
    }
    
}
