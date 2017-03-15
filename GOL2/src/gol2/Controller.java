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
import javafx.scene.control.ColorPicker;
import javafx.event.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import java.util.Timer;
import java.util.TimerTask;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.CornerRadii;

/**
 *
 * @author andre
 */
public class Controller implements Initializable {
    
    
    
     
    @FXML 
    private Canvas canvas;
    //grid rect size
    final int wid = 50;
    final int hei = 50;
    private boolean [][]currentMove = new boolean[hei][wid], nextMove=new boolean[hei][wid];
    boolean play;
    GraphicsContext gc;
  
   
    @FXML SplitPane splitPane;
    @FXML ColorPicker colorPicker;
    @FXML ColorPicker colorPicker2;
    @FXML public Button start;
    @FXML public Button reset;
    
    Timer time = new Timer();
   
    @FXML
    public void CellActivation(){
    gc= canvas.getGraphicsContext2D();
    gc.strokeRect(0,0,canvas.getWidth(),canvas.getHeight());
        
    //Draw
    for(int i=0;i<hei;i++){
            for(int j=0;j<wid;j++){
                if(currentMove[i][j]){
                 gc.setFill(Color.YELLOW);
                 int y = (int) (i * canvas.getHeight()/hei);
                 int x = (int) (j * canvas.getWidth()/wid);
                 
                 gc.fillRect(x, y,canvas.getWidth()/wid,canvas.getHeight()/hei);
                
                } 
            }
        
        }
    
    }
   
    @FXML
    public void PaintGrid(){
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
        
    } 
    
        
    
//jobber med denne
    //Decide witch cells die or live
    @FXML
     private boolean decide(int i, int j){
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
     }
     
     
     
     //slutt jobber med denne
     
        
     public void startButton(ActionEvent event){
      play = !play;
      if (play){ start.setText("Pause");}
      else{ start.setText("Start");}
      background();
      CellActivation();
      PaintGrid();
    }
     
    @FXML public void resetButton(ActionEvent event){
      currentMove = new boolean[hei][wid];
      background();
      PaintGrid();
    }
    public void background(){
        gc= canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);     
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        
         //Change canvas background whith color picker   
         colorPicker.setOnAction(new EventHandler() {
         @Override
         public void handle(Event t) {
         Color c = colorPicker.getValue();
         gc.setFill(c);    
         gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
         
         CellActivation();
         PaintGrid(); 
         
             
         
     }
 });
         Color c = colorPicker.getValue();
         gc.setFill(c);    
         gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
         
         CellActivation();
         PaintGrid(); 
    }
    
    //jobber med denne
    @FXML
    public void splitPane(){
        
        
         colorPicker2.setOnAction(new EventHandler() {
         @Override
         public void handle(Event t) {
         Color c = colorPicker2.getValue();
         gc.setFill(c);    
         gc.fillRect(0,0,splitPane.getWidth(),splitPane.getHeight());
         CellActivation();
          
         PaintGrid(); 
     }
 });
   
    }
    
      // Fill cell with yellow color
    @FXML
    public void canvasMouseEvent(MouseEvent e){
            int j = (int) (wid * e.getX() / canvas.getWidth()) ;
            int i = (int) (hei * e.getY() / canvas.getHeight()) ;
            currentMove[i][j] = !currentMove[i][j]; 
            background();
            CellActivation();
            PaintGrid();
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        background(); 
        CellActivation();
        PaintGrid();
       
        
         TimerTask task = new TimerTask(){
            @Override
            public void run(){
                if(play){
                    for(int i = 0; i < hei; i++){
                       for(int j = 0; j < wid; j++){
                           nextMove[i][j] = decide(i,j);
                       }
                    }
                     for(int i = 0; i < hei; i++){
                       for(int j = 0; j < wid; j++){
                          currentMove[i][j] = nextMove[i][j];
                       }
                     }
                     background();
                     CellActivation();
                     PaintGrid();
                }
            }
        };
        time.scheduleAtFixedRate(task, 0, 100);
        
        
     
    
      

 
    }
}

