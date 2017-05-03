/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author andre
 */
public class GOL_Main extends Application {
    
    /**
     * Starts the java application.
     * Sets the title to Game Of Life.
     * Sets the stage to fixed dimensions.
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/FXMLDocument.fxml"));
        stage.setTitle("Game Of Life");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        // make scene non responsive
        stage.setResizable(false);
        
        
        /**
         * Press escape to close program
         */
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE){
                    Platform.exit();
                }
            }
        });
          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        System.exit(0);
    
    }
    
}
