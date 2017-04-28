/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;





import Model.GridAndCells;
import Model.PatternImport;
import Model.Rules;
import Model.RunLengthEncoding;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.imageio.ImageIO;


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
    @FXML private RadioButton slowSpeed;
    @FXML private RadioButton normalSpeed;
    @FXML private RadioButton fastSpeed;
    @FXML public FileChooser fileImport;
    @FXML public Button rules;
    @FXML public Label generationCounter;
    @FXML public Button Snapshot;
    @FXML public Button RLEurl;
    
   private double time;
   private double startSpeed = 6;
   private long numberOfGenerations= 0;
  
  /**
   *Starting the animation of the game.
   */  
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
            numberOfGenerations++;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);
            
           }}}
           };//End of animation timer
  
  
   /**
    * Transferring array from a pattern into the array used to draw the cells.
    * @param newMove 
    */
   private void loadVisualization(boolean [][] newMove){
        for( int y =0; y < newMove.length; y++){
            for( int x =0; x < newMove[y].length; x++){    
                currentMove [y+wid/2][x+hei/2] = newMove [y][x];                     
        }
    }} //End of loadVisualization
   
   /**
    * Takes a screen shot of what is drawn on the canvas.
    */
   @FXML
    public void Snapshot() {
    WritableImage image = canvas.snapshot(new SnapshotParameters(), null);
    FileChooser screenshot = new FileChooser();
    File file = screenshot.showSaveDialog(new Stage());
    String Text = ""; 
   
    try {
        ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
    } catch (IOException e) {
        // TODO: handle exception here
    }
}
    
    /**
     * Imports RLE file from URL 
     * @param e POPup windows with text field input for URL address
     */
    @FXML
    public void URLreader(ActionEvent e){
        Stage URLWindow = new Stage();
        URLWindow.initModality(Modality.APPLICATION_MODAL);
        Label URLlabel = new Label();
        TextField URLfield = new TextField();
        HBox URLtext = new HBox(5);
        URLtext.getChildren().addAll(URLlabel,URLfield);
        URLtext.setAlignment(Pos.CENTER);
        URLlabel.setStyle("-fx-font: 24 sans-serif;");
        URLlabel.setText("URL:");
        URLWindow.setTitle("RLE URL Import");
        URLWindow.setMinWidth(600);
        URLWindow.setMinHeight(300);
        Button Import = new Button();
        Import.setText("Import RLE URL");
        Import.setStyle("-fx-font: 24 sans-serif;");
        Import.setOnAction(event -> {
            String URLimport = URLfield.getText();
            //http://www.conwaylife.com/patterns/gosperglidergun.rle
            //reset 
        currentMove = new boolean[move][move];
        numberOfGenerations = 0;
        String generationText = Long.toString(numberOfGenerations);
        generationCounter.setText(generationText);
        background();
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        //import URL RLE
        loadVisualization(RunLengthEncoding.decode(RunLengthEncoding.RLEurl(URLimport)));
        background();
        GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        URLWindow.close();
        });
        VBox layout = new VBox(10);
        layout.getChildren().addAll(URLtext,Import);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        URLWindow.setScene(scene);
        URLWindow.showAndWait();
        
    }
    /**
     * Imports RLE files from computer.
     * @param e Waits for button click to be performed before running this method (Import RLE Files).
     */      
    @FXML
    public void FileImport(ActionEvent e){
        //reset
        currentMove = new boolean[move][move];
        numberOfGenerations = 0;
        String generationText = Long.toString(numberOfGenerations);
        generationCounter.setText(generationText);
        background();
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        //import RLE
        loadVisualization(RunLengthEncoding.decode(RunLengthEncoding.Fileimport()));
        background();
        GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
    }
    
    /**
     *  Choice method imports custom patterns I have created.
     */
    @FXML
    public void choice(){
        choicebox.getSelectionModel().selectedItemProperty().addListener((value,oldValue,newValue)->{
        
        if(choicebox.getValue().equals("Game Of Life")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);      
            PatternImport.generateGameOfLife(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
    }
   if(choicebox.getValue().equals("Tie Fighter")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);       
            PatternImport.generateTieFighter(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("HIOA")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);       
            PatternImport.generateHIOA(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Nothing")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);       
            PatternImport.generateNothing(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Star")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);       
            PatternImport.generateStar(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
            return;
       
   }
   if(choicebox.getValue().equals("Death Star")){  
            currentMove = new boolean[hei][wid];
            numberOfGenerations = 0;
            String generationText = Long.toString(numberOfGenerations);
            generationCounter.setText(generationText);       
            PatternImport.generateDeathStar(currentMove);
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);    
   }
   });
             
    }// End of choice
    
    /**
     * Slows down the speed.
     * @param e Changes the default start speed of the Animation timer and slows down the iterations (RadioButton Slow).
     * @return 
     */
    @FXML
    public double slowButton(ActionEvent e){
          return startSpeed=10;
       }//End of slowButton
    
    /**
     * Sets the speed to default.
     * @param e Changes the iteration speed to default start speed of the Animation timer (RadioButton Normal).
     * @return 
     */
    @FXML
    public double normalButton(ActionEvent e){
            return startSpeed=6;
       }//End of normalButton
    
    /**
     * Increases the speed.
     * @param e Changes the default start speed of the Animation timer and speeds up the iterations(RadioButton Fast).
     * @return 
     */
    @FXML
    public double fastButton(ActionEvent e){
         return startSpeed=1;
       }//End of fastButton
     
    
    /**
     * Changes the speed.
     * @param event Changes the iteration speed of the Animation timer (Slider Speed).
     */
     @FXML
     public void SpeedBar(MouseEvent event){
     startSpeed = speedBar.getValue();
     }//End of SpeedBar
     
     /**
      * Changes the grid size.
      * @param event Changes the grid dimensions (Slider Grid Size).
      */
     @FXML
     public void GridBar(MouseEvent event){
     wid = (int) gridBar.getValue();
     hei = (int) gridBar.getValue();
     background();
     GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
     GridAndCells.PaintGrid(gc, canvas, hei, wid);
     }// End of GridBar
     
     /**
      * Starts and pauses the animation timer(game).
      * @param event Waits for button clicked to be performed before running this method (Start Button).
      */
     @FXML   
     public void startButton(ActionEvent event){
      play = !play;
      if (play){ start.setText("Pause");}
      else{ start.setText("Start");}
      background();
      GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
      GridAndCells.PaintGrid(gc, canvas, hei, wid);
    }//End of startButton
     
     /**
      * Clears all live cells from the canvas.
      * @param event Waits for button clicked to be performed before running this method (Reset Button).
      */
    @FXML public void resetButton(ActionEvent event){
      currentMove = new boolean[move][move];
      background();
      GridAndCells.PaintGrid(gc, canvas, hei, wid);
      numberOfGenerations = 0;
      String generationText = Long.toString(numberOfGenerations);
      generationCounter.setText(generationText);
    }//End of resetButton
    
    /**
     * Displays the game of life rules in a PopUp window.
     * @param event  Waits for button clicked to be performed before running this method (Rules Button).
     */
    @FXML public void rulesButton(ActionEvent event){
        Rules.displayRules();
    }

    /**
     * Draws the Grid and background color.
     */
    private void background(){
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
  
    /**
     * Method for activating and deactivating cells on the canvas.
     * @param e Waits for mouse event to be performed before activating this method.
     */
    @FXML
    public void canvasMouseEvent(MouseEvent e){
            int j = (int) (wid * e.getX() / canvas.getWidth()) ;
            int i = (int) (hei * e.getY() / canvas.getHeight()) ;
            currentMove[i][j] = !currentMove[i][j]; 
            background();
            GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
            GridAndCells.PaintGrid(gc, canvas, hei, wid);
    
    }//End of canvasMouseEvent
    
   /**
    * Random generates live cells on the canvas.
    */
   private void RandomGeneration(){
       gc = canvas.getGraphicsContext2D();
       Random G = new Random();
       for(int y = 0; y<hei;y++){
           for(int x =0; x<wid;x++){
              boolean random = G.nextBoolean();
              currentMove [y][x] = random;
           }
       }
   }//End of RandomGeneration
   
   /**
    * Random generates live cells on the canvas.
    * @param e Waits for button clicked to be performed before running this method (Random button).
    */
    @FXML
    public void randomFunction(ActionEvent e){
        RandomGeneration();
        GridAndCells.CellActivation(gc, canvas, hei, wid, currentMove, colorPicker2);
        GridAndCells.PaintGrid(gc, canvas, hei, wid);
        
    }//End of randomFunction
    
    /**
     * Set the colorPicker to blue color at the start of the java application.
     * Imports the Game Of Life pattern at start of the java application.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
   
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

