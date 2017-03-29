/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.fxml.FXML;

/**
 *
 * @author andre
 */




public class PatternImport {

    private static boolean[][] currentMove;
    
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
    
}
