/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class RunLengthEncodingTest {
    
    public RunLengthEncodingTest() {
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
     * Test of decode method, of class RunLengthEncoding.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String Text = "this is me";
        boolean[][] expResult = {};
        boolean[][] result = RunLengthEncoding.decode(Text);
        assertArrayEquals(expResult, result);
    } 
}
