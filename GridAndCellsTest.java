/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
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
public class GridAndCellsTest {
    
    public GridAndCellsTest() {
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
     * Test of PaintGrid method, of class GridAndCells.
     */
    
    @Test
    public void testPaintGrid() {
        System.out.println("PaintGrid");
        Canvas canvas = new Canvas();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeRect(0,0,canvas.getWidth(),canvas.getHeight());
        gc.setFill(Color.BLACK);
        int hei = 5;
        int wid = 5;
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        System.out.println(gc.getLineCap());
    }
    /**
     * Test of CellActivation method, of class GridAndCells.
     */
   @Test
    public void testCellActivation() {
        System.out.println("CellActivation");
        
        Canvas canvas = new Canvas();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeRect(2,3,canvas.getWidth(),canvas.getHeight());
        int hei = 5;
        int wid = 6;
        boolean[][] currentMove = { { false, false,true ,true ,false, false },
                                    { false, true,false, false, true ,false },
                                    { false, true,false, false, true ,false },
                                    { false, true,false, false, true ,false },
                                    { false, false,true ,true ,false, false }, };
        
          
        System.out.println(gc.getLineCap());
        //assertEquals(gc.strokeRect(2,3,canvas.getWidth(),canvas.getHeight()), gc.getFillRule());
        System.out.println("CellActivation end");
    }

    /**
     * Test of decide method, of class GridAndCells.
     */
    @Test
    public void testDecide() {
        System.out.println("testing decide ");
        int i = 2;
        int j = 3;
        boolean[][] currentMove = { { false, false,true ,true ,false, false },
                                    { false, true,false, false, true ,false },
                                    { false, true,false, false, true ,false },
                                    { false, true,false, false, true ,false },
                                    { false, false,true ,true ,false, false }, };
        
        int hei = 5;
        int wid = 6;
        boolean expResult = true;
        boolean result = GridAndCells.decide(i, j, currentMove, hei, wid);
        assertEquals(expResult, result);
    }
}
