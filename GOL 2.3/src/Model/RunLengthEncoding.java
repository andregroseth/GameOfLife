/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Andre
 */

public class RunLengthEncoding {
    static String Text = ""; 
    
    
    
    public static void Fileimport(){
        FileChooser fileImport = new FileChooser();
        fileImport.setTitle("File Import");
        File file = fileImport.showOpenDialog(new Stage());
        
        
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
            }    
                 
          
        }
              
       
    }//End of fileImport
    
 
    
    public static String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            dest.append(runLength);
            dest.append(source.charAt(i));
        }
        return dest.toString();
    }
 
    public static boolean[][] decode() {
      
        
        Pattern pattern = Pattern.compile("x = (\\d+), y = (\\d+)");
        Matcher matcher = pattern.matcher(Text);
        int x = 0,  y = 0;
        
        if (matcher.find()) {
            x = Integer.parseInt(matcher.group(1));
            y = Integer.parseInt(matcher.group(2));
            }
        boolean [][] visualization = new boolean[y][x];
        
     //   System.out.println(x +" " +y);
        
        Pattern serchPattern = Pattern.compile("( ?\\d? ?b? ?\\d? ?o? ?)+[$!]");
        Matcher matchPattern = serchPattern.matcher(Text);
      
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
        }
        return visualization;
        
        }// End of decode
        
    
}//End of class
