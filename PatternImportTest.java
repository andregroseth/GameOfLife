/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AdDiS
 */
public class PatternImportTest {
    
    public PatternImportTest() {
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
     * Test of generateNothing method, of class PatternImport.
     */
 @Test
    public void testGenerateNothing() {
        System.out.println("generateNothing");
        boolean[][] currentMove = null;  
        PatternImport.generateNothing(currentMove);
        Assert.assertArrayEquals(null, currentMove);
        
}
}
