/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Andre
 */

/**
 * Displays the game of life rules in a PopUp window
 * @author Andre
 */
public class Rules {
    public static void displayRules(){
        Stage ruleWindow = new Stage();
        ruleWindow.initModality(Modality.APPLICATION_MODAL);
        Label label = new Label();
        label.setStyle("-fx-font: 24 sans-serif;");
        label.setText("                                                                    Rules \n\n" +
        "   1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.\n" +
        "   2. Any live cell with two or three live neighbours lives on to the next generation.\n" +
        "   3. Any live cell with more than three live neighbours dies, as if by overpopulation.\n" +
        "   4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.");
        ruleWindow.setTitle("Rules");
        ruleWindow.setMinWidth(600);
        ruleWindow.setMinHeight(300);
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        ruleWindow.setScene(scene);
        ruleWindow.showAndWait();
    

    }// End Of Rules
    
}// End Of Class
