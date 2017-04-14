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
    
     //Decide witch cells die or live 
     public static boolean decide(int i, int j,boolean currentMove[][],int hei,int wid){
        int neighbors = 0; 
        if(j > 0){
            if(currentMove[i][j-1]) neighbors++;
            if(i>0) if(currentMove[i-1][j-1]) neighbors++;
            if(i<hei-1) if(currentMove[i+1][j-1]) neighbors++;    
        }
        if(j < wid-1){
            if(currentMove[i][j+1]) neighbors++;
            if(i>0) if (currentMove[i-1][j+1]) neighbors++;
            if(i<hei-1) if (currentMove[i+1][j+1]) neighbors++;
        
    }
          if(i>0) if (currentMove[i-1][j]) neighbors++;
          if(i<hei-1) if (currentMove[i+1][j]) neighbors++;
          if(neighbors == 3) return true;
          if(currentMove[i][j] && neighbors == 2) return true;
          return false;
     }//End of decide
}//End of class
