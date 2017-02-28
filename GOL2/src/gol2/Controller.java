/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author andre
 */
public class Controller implements Initializable {
    
    
    @FXML 
    private Canvas canvas;
    //grid size
    final int wid = 50;
    final int hei = 50;
    
    
    private boolean [][]currentmove = new boolean[hei][wid], nextmove=new boolean[hei][wid];
    
    
    @FXML
    public void CellActivation(){
   
        
    GraphicsContext gc= canvas.getGraphicsContext2D();
    
    gc.strokeRect(0,0,canvas.getWidth(),canvas.getHeight());
        
    //Activate/Deactivate cells
    for(int i=0;i<hei;i++){
            for(int j=0;j<wid;j++){
                if(currentmove[i][j]){
                
                 int y = (int) (i * canvas.getHeight()/hei);
                 int x = (int) (j * canvas.getWidth()/wid);
                 
                 gc.fillRect(x, y,canvas.getWidth()/wid,canvas.getHeight()/hei);
                 gc.setFill(Color.YELLOW);
                }
            }
        
        }
    
    }
    
    
    
    
    @FXML
    public void PaintGrid(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
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
        
    } 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
        PaintGrid();
        CellActivation();
    }    
}

