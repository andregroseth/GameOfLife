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

/**
 *
 * @author andre
 */
public class GridAndCells {
    
    
    
    /**
     * Draws the grid on the canvas.
     * @param gc Specifies witch graphics content to be used.
     * @param canvas Specifies witch canvas the grid will be drawn in.
     * @param hei Height dimension of the grid, this decides how horizontally large the grid will be.
     * @param wid Width dimension of the grid, this decides how vertically large the grid will be.
     */
    public static void PaintGrid(GraphicsContext gc,Canvas canvas,int hei,int wid){
        gc = canvas.getGraphicsContext2D();
        gc.strokeRect(0,0,canvas.getWidth(),canvas.getHeight());
        gc.setFill(Color.BLACK);
        // Y line
        for(int i = 1; i < hei; i++){
            int y =(int) (i * canvas.getHeight() / hei);
            gc.strokeLine(0 , y,canvas.getWidth(),y);
        }
        // X line
        for(int j = 1; j < wid;j++){
            int x = (int) (j * canvas.getWidth()/ wid);
            gc.strokeLine(x, 0, x, canvas.getHeight());
        }    
    }//End of PaintGrid 
    
   /**
    * Activates the cells on the canvas
    * @param gc Specifies witch graphics content to be used.
    * @param canvas Specifies witch canvas the grid will be drawn in.
    * @param hei Height dimension of the grid, this decides how horizontally large the grid will be.
    * @param wid Width dimension of the grid, this decides how vertically large the grid will be.
    * @param currentMove Vertical and horizontal grid array.
    * @param colorPicker2 Chooses cell color.
    */
    public static void CellActivation(GraphicsContext gc,Canvas canvas,int hei,int wid,boolean currentMove[][],ColorPicker colorPicker2){
    gc= canvas.getGraphicsContext2D();
    gc.strokeRect(0,0,canvas.getWidth(),canvas.getHeight());
        
    //Draw
    for(int i=0;i<hei;i++){
            for(int j=0;j<wid;j++){
                if(currentMove[i][j]){
                 //gc.setFill(Color.YELLOW);
                 //Change cell color
                 Color c = colorPicker2.getValue();
                 gc.setFill(c); 
                
                 int y = (int) (i * canvas.getHeight()/hei);
                 int x = (int) (j * canvas.getWidth()/wid);
                 
                 gc.fillRect(x, y,canvas.getWidth()/wid,canvas.getHeight()/hei);
                
                } 
            }  
        }
    }//End of CellActivation
    
    /**
     * Decide which cells die or live
     * @param y y coordinates 
     * @param x x coordinates
     * @param currentMove Vertical and horizontal grid array.
     * @param hei Height dimension of the grid, this decides how horizontally large the grid will be.
     * @param wid Width dimension of the grid, this decides how vertically large the grid will be.
     * @return 
     */
     //Decide which cells die or live
     public static boolean decide(int y, int x,boolean currentMove[][],int hei,int wid){
        int neighbors = 0; 
        if(x > 0){
            if(currentMove[y][x-1]) neighbors++;
            if(y>0) if(currentMove[y-1][x-1]) neighbors++;
            if(y<hei-1) if(currentMove[y+1][x-1]) neighbors++;    
        }
        if(x < wid-1){
            if(currentMove[y][x+1]) neighbors++;
            if(y>0) if (currentMove[y-1][x+1]) neighbors++;
            if(y<hei-1) if (currentMove[y+1][x+1]) neighbors++;
        
    }
          if(y>0) if (currentMove[y-1][x]) neighbors++;
          if(y<hei-1) if (currentMove[y+1][x]) neighbors++;
          if(neighbors == 3) return true;
          if(currentMove[y][x] && neighbors == 2) return true;
          return false;
     }//End of decide
     
     
     
}//End of class
