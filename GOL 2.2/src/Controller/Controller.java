/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;




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
    private boolean [][]currentMove = new boolean[move][move], nextMove=new boolean[move][move];
    boolean play;
    GraphicsContext gc;
  
    
    @FXML ColorPicker colorPicker;
    @FXML ColorPicker colorPicker2;
    @FXML public Button start;
    @FXML public Button reset;
    @FXML public Button random;
    @FXML private ChoiceBox choicebox;
        ObservableList<String> options = FXCollections.observableArrayList("Game Of Life","HIOA","Ten In A Row","4","5");
    @FXML public Slider speedBar;
    @FXML public Slider gridBar;
    //@FXML public Scrollbar gridBar;
     @FXML private RadioButton slowSpeed;
     @FXML private RadioButton normalSpeed;
     @FXML private RadioButton fastSpeed;
    
     
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
            time=0;
           }}}
           };
   


    
     @FXML    
    //game of life pattern
     public void generateGameOfLife(){
         // [row][collum]
         //G
        currentMove [17][17] = true;
        currentMove [18][17] = true; 
        currentMove [19][17] = true; 
        currentMove [20][17] = true; 
        currentMove [21][17] = true; 
        currentMove [17][18] = true;
        currentMove [21][18] = true;
        currentMove [17][19] = true;
        currentMove [19][19] = true;
        currentMove [21][19] = true;
        currentMove [17][20] = true;
        currentMove [19][20] = true;
        currentMove [20][20] = true;
        currentMove [21][20] = true;
        //A
        currentMove [18][22] = true;
        currentMove [19][22] = true;
        currentMove [20][22] = true;
        currentMove [21][22] = true;
        currentMove [17][23] = true;
        currentMove [18][23] = true;
        currentMove [20][23] = true;
        currentMove [18][24] = true;
        currentMove [19][24] = true;
        currentMove [20][24] = true;
        currentMove [21][24] = true;
        //M
        currentMove [17][26] = true;
        currentMove [18][26] = true; 
        currentMove [19][26] = true; 
        currentMove [20][26] = true; 
        currentMove [21][26] = true; 
        currentMove [18][27] = true;
        currentMove [19][28] = true;
        currentMove [18][29] = true;
        currentMove [17][30] = true;
        currentMove [18][30] = true; 
        currentMove [19][30] = true; 
        currentMove [20][30] = true; 
        currentMove [21][30] = true;
        //E
        currentMove [17][32] = true;
        currentMove [18][32] = true; 
        currentMove [19][32] = true; 
        currentMove [20][32] = true; 
        currentMove [21][32] = true;
        currentMove [17][33] = true;
        currentMove [19][33] = true;
        currentMove [21][33] = true;
        currentMove [17][34] = true;
        currentMove [19][34] = true;
        currentMove [21][34] = true;
        //O
        currentMove [25][22] = true;
        currentMove [26][22] = true;
        currentMove [27][22] = true;
        currentMove [24][23] = true;
        currentMove [28][23] = true;
        currentMove [24][24] = true;
        currentMove [28][24] = true;
        currentMove [25][25] = true;
        currentMove [26][25] = true;
        currentMove [27][25] = true;
        //F
        currentMove [24][27] = true;
        currentMove [25][27] = true;
        currentMove [26][27] = true;
        currentMove [27][27] = true;
        currentMove [28][27] = true;
        currentMove [24][28] = true;
        currentMove [26][28] = true;
        currentMove [24][29] = true;
        currentMove [26][29] = true;
        //L
        currentMove [31][18] = true;
        currentMove [32][18] = true;
        currentMove [33][18] = true;
        currentMove [34][18] = true;
        currentMove [35][18] = true;
        currentMove [35][19] = true;
        currentMove [35][20] = true;
        //I
        currentMove [31][22] = true;
        currentMove [35][22] = true;
        currentMove [31][23] = true;
        currentMove [32][23] = true;
        currentMove [33][23] = true;
        currentMove [34][23] = true;
        currentMove [35][23] = true;
        currentMove [31][24] = true;
        currentMove [35][24] = true;
        //F
        currentMove [31][26] = true;
        currentMove [32][26] = true;
        currentMove [33][26] = true;
        currentMove [34][26] = true;
        currentMove [35][26] = true;
        currentMove [31][27] = true;
        currentMove [33][27] = true;
        currentMove [31][28] = true;
        currentMove [33][28] = true;
        //E
        currentMove [31][30] = true;
        currentMove [32][30] = true; 
        currentMove [33][30] = true; 
        currentMove [34][30] = true; 
        currentMove [35][30] = true;
        currentMove [31][31] = true;
        currentMove [33][31] = true;
        currentMove [35][31] = true;
        currentMove [31][32] = true;
        currentMove [33][32] = true;
        currentMove [35][32] = true;
    }
    
     @FXML
     //Ten in a row pattern
     public void generateTenInARow(){
         // [row][collum]
        currentMove [25][25] = true; 
        currentMove [25][26] = true; 
        currentMove [25][27] = true; 
        currentMove [25][28] = true;
        currentMove [25][29] = true;
        currentMove [25][30] = true;
        currentMove [25][24] = true;
        currentMove [25][23] = true;
        currentMove [25][22] = true;
        currentMove [25][21] = true;
     }
     
     @FXML
     //HIOA pattern
     public void generateHIOA(){
         // [row][collum]
         //H
        currentMove [22][18] = true; 
        currentMove [23][18] = true;
        currentMove [24][18] = true;
        currentMove [25][18] = true;
        currentMove [26][18] = true;
        currentMove [24][19] = true;
        currentMove [24][20] = true;
        currentMove [22][21] = true; 
        currentMove [23][21] = true;
        currentMove [24][21] = true;
        currentMove [25][21] = true;
        currentMove [26][21] = true;   
        //I
        currentMove [22][23] = true;
        currentMove [26][23] = true;
        currentMove [22][24] = true;
        currentMove [23][24] = true;
        currentMove [24][24] = true;
        currentMove [25][24] = true;
        currentMove [26][24] = true;
        currentMove [22][25] = true;
        currentMove [26][25] = true;
        //O
        currentMove [23][27] = true;
        currentMove [24][27] = true;
        currentMove [25][27] = true;
        currentMove [22][28] = true;
        currentMove [26][28] = true;
        currentMove [22][29] = true;
        currentMove [26][29] = true;
        currentMove [23][30] = true;
        currentMove [24][30] = true;
        currentMove [25][30] = true;
        //A
        currentMove [23][32] = true;
        currentMove [24][32] = true;
        currentMove [25][32] = true;
        currentMove [26][32] = true;
        currentMove [22][33] = true;
        currentMove [23][33] = true;
        currentMove [25][33] = true;
        currentMove [23][34] = true;
        currentMove [24][34] = true;
        currentMove [25][34] = true;
        currentMove [26][34] = true;
        
        
     }
     
     
    @FXML
    public void choice(){
        choicebox.getSelectionModel().selectedItemProperty().addListener((value,oldValue,newValue)->{
        
        if(choicebox.getValue().equals("Game Of Life")){  
            currentMove = new boolean[hei][wid];
                   
            generateGameOfLife();
            background();
            CellActivation();
            PaintGrid();
            return;
    }
   if(choicebox.getValue().equals("Ten In A Row")){  
            currentMove = new boolean[hei][wid];
                   
            generateTenInARow();
            background();
            CellActivation();
            PaintGrid();
            return;
       
   }
   if(choicebox.getValue().equals("HIOA")){  
            currentMove = new boolean[hei][wid];
                   
            generateHIOA();
            background();
            CellActivation();
            PaintGrid();
            return;
       
   }
        });
        
        
        
    }
    
   
    @FXML
    public double slowButton(ActionEvent e){
          return startSpeed=10;
       }
    
    @FXML
    public double normalButton(ActionEvent e){
            return startSpeed=6;
       }
    
    @FXML
    public double fastButton(ActionEvent e){
         return startSpeed=1;
       }

    
    @FXML
    public void CellActivation(){
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
    
     
   
     
     
     
      
     @FXML
     public void SpeedBar(MouseEvent event){
     startSpeed = speedBar.getValue();
     }
     
     @FXML
     public void GridBar(MouseEvent event){
     wid = (int) gridBar.getValue();
     hei = (int) gridBar.getValue();
     background();
     CellActivation();
     PaintGrid();
     
     }
     
     
     @FXML   
     public void startButton(ActionEvent event){
      play = !play;
      if (play){ start.setText("Pause");}
      else{ start.setText("Start");}
      background();
      CellActivation();
      PaintGrid();
    }
     
    @FXML public void resetButton(ActionEvent event){
      currentMove = new boolean[move][move];
      background();
      PaintGrid();
    }
    
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
  
    @FXML
    public void canvasMouseEvent(MouseEvent e){
            int j = (int) (wid * e.getX() / canvas.getWidth()) ;
            int i = (int) (hei * e.getY() / canvas.getHeight()) ;
            currentMove[i][j] = !currentMove[i][j]; 
            background();
            CellActivation();
            PaintGrid();
    
    }
    
   
   public void RandomGeneration(){
       gc = canvas.getGraphicsContext2D();
       Random G = new Random();
       for(int y = 0; y<hei;y++){
           for(int x =0; x<wid;x++){
              boolean random = G.nextBoolean();
              currentMove [y][x] = random;
           }
       }
   }
    @FXML
    public void randomFunction(ActionEvent e){
        RandomGeneration();
        CellActivation();
        PaintGrid();
        
    }
    
    
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
        generateGameOfLife();
        timer.start();
        
    
            background();
            CellActivation();
            PaintGrid();
            

  
    } // End of Initilize
    
}// End Of Class

