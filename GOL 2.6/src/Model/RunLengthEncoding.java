/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Andre
 */

public class RunLengthEncoding {
  
    
    
    /**
     * Imports and decodes RLE files from the computer and displays error if the file is not RLE format.
     * @return 
     */
    public static String Fileimport(){
        FileChooser fileImport = new FileChooser();
        fileImport.setTitle("File Import");
        fileImport.getExtensionFilters().addAll(
        new ExtensionFilter("RLE Files","*.rle"));
        File file = fileImport.showOpenDialog(new Stage());
        String Text = ""; 
        
        if(file!=null){
            
            try (FileReader read = new FileReader(file);
            BufferedReader reader = new BufferedReader(read);){
                
              
            String readLine = reader.readLine();
            while (readLine != null){
                Text +=" "+readLine;
                readLine =reader.readLine();
            }
                  System.out.println(Text);
            }catch(Exception e){
                System.err.println("Wrong file format. Please use RLE file format");
                displayError("Error","Wrong file format. Please use RLE file format");
            }    
                 
          
        }return Text;
              
       
    }//End of fileImport
    
 
    
    public static boolean[][] decode(String Text) {
      
        
        Pattern pattern = Pattern.compile("x = (\\d+), y = (\\d+)");
        Matcher matcher = pattern.matcher(Text);
        int x = 0,  y = 0;
        
        if (matcher.find()) {
            x = Integer.parseInt(matcher.group(1));
            y = Integer.parseInt(matcher.group(2));
            }
        boolean [][] visualization = new boolean[y][x];
        try{
            
        
     //   System.out.println(x +" " +y);
        
        Pattern searchPattern = Pattern.compile("( ?\\d? ?b? ?\\d? ?o? ?)+[$!]");
        Matcher matchPattern = searchPattern.matcher(Text);
      
        Pattern Cells = Pattern.compile("\\d*b|\\d*o");
        int row = 0, length, column;
        while (matchPattern.find()){
            matchPattern.group().replaceAll("\\s ",".");
     //         System.out.print(matchPattern.group());
        Matcher matchCell = Cells.matcher(matchPattern.group());
        column =0;
        while (matchCell.find()) {
            if (matchCell.group().length()!=1){
            length = Integer.parseInt(matchCell.group().substring(0, matchCell.group().length() -1));
    
            if (matchCell.group().charAt( matchCell.group().length() -1)=='b'){
                for (int columnPosition = column; columnPosition < column + length; columnPosition++){
                    visualization[row][columnPosition] = false;
                }
                } else {
                for (int columnPosition = column; columnPosition < column + length; columnPosition++){
                    visualization[row][columnPosition] = true;
               }
            
            }
            column += length;
            }else{
                if (matchCell.group().charAt(0) == 'b'){
                visualization[row][column] = false;
                }else{
                visualization[row][column] = true;
                }
                column++;
        }
        
        }
        row++;
        }}catch(Exception RLEerror ){
            displayError("Error","RLE File Is Corrupted");
        }
        return visualization;
        
        }// End of decode
        
     public static void displayError(String title,String message){
        Stage errorWindow = new Stage();
        errorWindow.initModality(Modality.APPLICATION_MODAL);
        Label errorlabel = new Label();
        errorlabel.setStyle("-fx-font: 24 sans-serif;");
        errorlabel.setText(message);
        errorWindow.setTitle(title);
        errorWindow.setMinWidth(600);
        errorWindow.setMinHeight(300);
        VBox layout = new VBox(10);
        layout.getChildren().addAll(errorlabel);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        errorWindow.setScene(scene);
        errorWindow.showAndWait();
    

    }// End Of Rules
  
     /**
      * 
      * @param URLimport Imports and decodes RLE files from URL address and displays error if the file is not RLE format.
      * @return 
      */
     public static String RLEurl(String URLimport){
         
         String Text = " ";  
         
         try{
             URL textbox = new URL(URLimport);
             URLConnection loadPage = textbox.openConnection();
             Reader pageReader = new InputStreamReader(loadPage.getInputStream());
             BufferedReader reader = new BufferedReader(pageReader);
             
             
            String readLine = reader.readLine();
            while (readLine != null){
                Text +=" "+readLine;
                readLine =reader.readLine();}
                
         }catch(Exception error){
             System.err.println("Wrong file format. Please use RLE file format");
             displayError("Error","Wrong file format. Please use RLE file format");
         }return Text;
         
         }//End of RLEurl
     
     
}//End of class
