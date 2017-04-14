/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;





import Model.GridAndCells;
import Model.PatternImport;
import Model.RunLengthEncoding;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.control.ColorPicker;
import javafx.event.*;
import javafx.event.ActionEvent;
import javafx.animation.AnimationTimer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 *
 * @author andre
 */
public class Controller implements Initializable {
    
    
    
     
    @FXML 
    private Canvas canvas;
    //grid rect size
    public int wid = 50;
    public int hei = 50;
    //max grid size
    public int move=500;
    public boolean [][]currentMove = new boolean[move][move], nextMove=new boolean[move][move];
    boolean play;
    GraphicsContext gc;
  
    
    @FXML ColorPicker colorPicker;
    @FXML ColorPicker colorPicker2;
    @FXML public Button start;
    @FXML public Button reset;
    @FXML public Button random;
    @FXML private ChoiceBox choicebox;
        ObservableList<String> options = FXCollections.observableArrayList("Game Of Life","HIOA","Tie Fighter","Star","Death Star","Nothing");
    @FXML public Slider speedBar;
    @FXML public Slider gridBar;
    //@FXML public Scrollbar gridBar;
    @FXML private RadioButton slowSpeed;
    @FXML private RadioButton normalSpeed;
    @FXML private RadioButton fastSpeed;
    @FXML public FileChooser fileImport;

 
   private double time;
   private double startSpeed = 6;
   
   //animation timer
   AnimationTimer timer = new AnimationTimer(){
          @Override
           public void handle(long now){
           if(play){
               time +=1;
               if(time>= startSpeed){
            for(int i = 0; i < hei; i++){
                       for(int j = 0; j < wid; j++){
                           nextMove[i][j] = GridAndCells.decide(i,j,currentMove,hei,wid);
                       }
                    }
                     for(int i = 0; i < hei; i++){
                       for(int j = 0; j < wid; j++){
                          currentMove[i][j] = nextMove[i][j];
                       }
                     }   
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            time=0;
           }}}
           };//End of animation timer
  
    
   
   public void loadVisualization(boolean [][] newMove){
        for( int y =0; y < newMove.length; y++){
            for( int x =0; x < newMove[y].length; x++){    
                currentMove [y+wid/2][x+hei/2] = newMove [y][x];
                        
        }
    }} //End of loadVisualization
   
   
    @FXML
    public void FileImport(ActionEvent e){
        currentMove = new boolean[move][move];
        background();
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        RunLengthEncoding.Fileimport();
        loadVisualization(RunLengthEncoding.decode());
        background();
        GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
    }
    
    @FXML
    public void choice(){
        choicebox.getSelectionModel().selectedItemProperty().addListener((value,oldValue,newValue)->{
        
        if(choicebox.getValue().equals("Game Of Life")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateGameOfLife(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
    }
   if(choicebox.getValue().equals("Tie Fighter")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateTieFighter(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("HIOA")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateHIOA(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Nothing")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateNothing(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Star")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateStar(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Death Star")){  
            currentMove = new boolean[hei][wid];
                   
            PatternImport.generateDeathStar(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);    
   }
   });
             
    }// End of choice
    
   
    @FXML
    public double slowButton(ActionEvent e){
          return startSpeed=10;
       }//End of slowButton
    
    @FXML
    public double normalButton(ActionEvent e){
            return startSpeed=6;
       }//End of normalButton
    
    @FXML
    public double fastButton(ActionEvent e){
         return startSpeed=1;
       }//End of fastButton
      
     @FXML
     public void SpeedBar(MouseEvent event){
     startSpeed = speedBar.getValue();
     }//End of SpeedBar
     
     @FXML
     public void GridBar(MouseEvent event){
     wid = (int) gridBar.getValue();
     hei = (int) gridBar.getValue();
     background();
     GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
     GridAndCells.PaintGrid(gc, canvas, hei, wid);
     }// End of GridBar
     
     @FXML   
     public void startButton(ActionEvent event){
      play = !play;
      if (play){ start.setText("Pause");}
      else{ start.setText("Start");}
      background();
      GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
      GridAndCells.PaintGrid(gc, canvas, hei, wid);
    }//End of startButton
     
    @FXML public void resetButton(ActionEvent event){
      currentMove = new boolean[move][move];
      background();
      GridAndCells.PaintGrid(gc, canvas, hei, wid);
    }//End of resetButton
    
    public void background(){
        gc= canvas.getGraphicsContext2D();
        //Trenger ikke disse 2 linjene
        gc.setFill(Color.WHITE);     
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        
         //Change canvas background whith color picker   
         colorPicker.setOnAction(new EventHandler() {
         @Override
         public void handle(Event t) {
         Color c = colorPicker.getValue();
         gc.setFill(c);    
         gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
         
         GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
         GridAndCells.PaintGrid(gc, canvas, hei, wid);    
     }
 });
         Color c = colorPicker.getValue();
         gc.setFill(c);    
         gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
         
         GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
         GridAndCells.PaintGrid(gc, canvas, hei, wid); 
    }//End of background
  
    @FXML
    public void canvasMouseEvent(MouseEvent e){
            int j = (int) (wid * e.getX() / canvas.getWidth()) ;
            int i = (int) (hei * e.getY() / canvas.getHeight()) ;
            currentMove[i][j] = !currentMove[i][j]; 
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
    
    }//End of canvasMouseEvent
    
   
   public void RandomGeneration(){
       gc = canvas.getGraphicsContext2D();
       Random G = new Random();
       for(int y = 0; y<hei;y++){
           for(int x =0; x<wid;x++){
              boolean random = G.nextBoolean();
              currentMove [y][x] = random;
           }
       }
   }//End of RandomGeneration
   
    @FXML
    public void randomFunction(ActionEvent e){
        RandomGeneration();
        GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        
    }//End of randomFunction
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        /*
        //rle
        String s = "Andreas er 22";
        Pattern p = Pattern.compile("Andreas er (\\d+)");
        Matcher m = p.matcher(s);
        
        if(m.find()){
            System.out.println("NUMMERET JEG FANT: " + m.group(1));
        }
        */ 
        
        colorPicker.setValue(Color.BLUE);
        choicebox.setValue("Game Of Life");
        choicebox.setItems(options);
        PatternImport.generateGameOfLife(currentMove);
        timer.start();
        
    
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);

            

  
    } // End of Initilize
    
}// End Of Class

