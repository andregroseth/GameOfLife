/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author andre
 */




public class PatternImport {

   
    
    /**
     * Generates a custom Game of life Pattern.
     * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Game OF Life).
     */
    //Game Of Life Pattern
     public static void generateGameOfLife(boolean currentMove[][]){
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
    }//End of Game Of life
    

     /**
      * Generates a custom Tie Fighter Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Tie Fighter).
      */
     //Tie Fighter pattern
     public static void generateTieFighter(boolean currentMove[][]){
         // [row][collum]
        currentMove [21][18] = true; 
        currentMove [25][18] = true;
        currentMove [26][18] = true;
        currentMove [27][18] = true;
        currentMove [31][18] = true;
        currentMove [20][19] = true;
        currentMove [21][19] = true;
        currentMove [22][19] = true;
        currentMove [23][19] = true;
        currentMove [24][19] = true;
        currentMove [25][19] = true;
        currentMove [26][19] = true;
        currentMove [27][19] = true;
        currentMove [28][19] = true;
        currentMove [29][19] = true;
        currentMove [30][19] = true;
        currentMove [31][19] = true;
        currentMove [32][19] = true;
        currentMove [29][19] = true;
        currentMove [19][20] = true;
        currentMove [20][20] = true;
        currentMove [26][20] = true;
        currentMove [32][20] = true;
        currentMove [33][20] = true;
        currentMove [19][21] = true;
        currentMove [26][21] = true;
        currentMove [33][21] = true;
        currentMove [24][22] = true;
        currentMove [25][22] = true;
        currentMove [26][22] = true;
        currentMove [27][22] = true;
        currentMove [28][22] = true;
        currentMove [23][23] = true;
        currentMove [26][23] = true;
        currentMove [29][23] = true;
        currentMove [22][24] = true;
        currentMove [25][24] = true;
        currentMove [26][24] = true;
        currentMove [27][24] = true;
        currentMove [30][24] = true;
        currentMove [22][25] = true;
        currentMove [24][25] = true;
        currentMove [28][25] = true;
        currentMove [30][25] = true;
        currentMove [22][26] = true;
        currentMove [23][26] = true;
        currentMove [24][26] = true;
        currentMove [26][26] = true;
        currentMove [28][26] = true;
        currentMove [29][26] = true;
        currentMove [30][26] = true;
        currentMove [22][27] = true;
        currentMove [24][27] = true;
        currentMove [28][27] = true;
        currentMove [30][27] = true;
        currentMove [22][28] = true;
        currentMove [25][28] = true;
        currentMove [26][28] = true;
        currentMove [27][28] = true;
        currentMove [30][28] = true;
        currentMove [23][29] = true;
        currentMove [26][29] = true;
        currentMove [29][29] = true;
        currentMove [24][30] = true;
        currentMove [25][30] = true;
        currentMove [26][30] = true;
        currentMove [27][30] = true;
        currentMove [28][30] = true;
        currentMove [19][31] = true;
        currentMove [26][31] = true;
        currentMove [33][31] = true;
        currentMove [19][32] = true;
        currentMove [20][32] = true;
        currentMove [26][32] = true;
        currentMove [32][32] = true;
        currentMove [33][32] = true;
        currentMove [20][33] = true;
        currentMove [21][33] = true;
        currentMove [22][33] = true;
        currentMove [23][33] = true;
        currentMove [24][33] = true;
        currentMove [25][33] = true;
        currentMove [26][33] = true;
        currentMove [27][33] = true;
        currentMove [28][33] = true;
        currentMove [29][33] = true;
        currentMove [30][33] = true;
        currentMove [31][33] = true;
        currentMove [32][33] = true;
        currentMove [29][33] = true;
        currentMove [21][34] = true; 
        currentMove [25][34] = true;
        currentMove [26][34] = true;
        currentMove [27][34] = true;
        currentMove [31][34] = true;
          
     }//End of Tie Fighter
  
     /**
      * Generates a custom HIOA Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox HIOA).
      */
     //HIOA pattern
     public static void generateHIOA(boolean currentMove[][]){
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
        
        
     }//End of HIOA
     
     /**
      * Generates a custom Star Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Star).
      */
     //Star pattern
     public static void generateStar(boolean currentMove[][]){
         // [row][collum]
        currentMove [22][18] = true; 
        currentMove [23][18] = true;
        currentMove [32][18] = true;
        currentMove [33][18] = true;
        currentMove [22][19] = true;
        currentMove [24][19] = true;
        currentMove [30][19] = true;
        currentMove [31][19] = true;
        currentMove [33][19] = true;
        currentMove [22][20] = true;
        currentMove [25][20] = true;
        currentMove [28][20] = true;
        currentMove [29][20] = true;
        currentMove [33][20] = true;
        currentMove [22][21] = true;
        currentMove [26][21] = true;
        currentMove [27][21] = true;
        currentMove [32][21] = true;
        currentMove [22][22] = true;
        currentMove [32][22] = true;
        currentMove [21][23] = true;
        currentMove [22][23] = true;
        currentMove [31][23] = true;
        currentMove [19][24] = true;
        currentMove [20][24] = true;
        currentMove [24][24] = true;
        currentMove [25][24] = true;
        currentMove [26][24] = true;
        currentMove [31][24] = true;
        currentMove [18][25] = true;
        currentMove [30][25] = true;
        currentMove [18][26] = true;
        currentMove [30][26] = true;
        currentMove [19][27] = true;
        currentMove [20][27] = true;
        currentMove [24][27] = true;
        currentMove [25][27] = true;
        currentMove [26][27] = true;
        currentMove [31][27] = true;
        currentMove [21][28] = true;
        currentMove [22][28] = true;
        currentMove [31][28] = true;
        currentMove [22][29] = true;
        currentMove [32][29] = true;
        currentMove [22][30] = true;
        currentMove [26][30] = true;
        currentMove [27][30] = true;
        currentMove [32][30] = true;
        currentMove [22][31] = true;
        currentMove [25][31] = true;
        currentMove [28][31] = true;
        currentMove [29][31] = true;
        currentMove [33][31] = true;
        currentMove [22][32] = true;
        currentMove [24][32] = true;
        currentMove [30][32] = true;
        currentMove [31][32] = true;
        currentMove [33][32] = true;
        currentMove [22][33] = true; 
        currentMove [23][33] = true;
        currentMove [32][33] = true;
        currentMove [33][33] = true;
         
        
     }//End Of Star
     
     /**
      * Generates a custom Death Star Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Death Star).
      */
        //Death Star pattern
     public static void generateDeathStar(boolean currentMove[][]){
         // [row][collum]
        currentMove [25][13] = true; 
        currentMove [26][13] = true; 
        currentMove [27][13] = true; 
        currentMove [30][13] = true; 
        currentMove [31][13] = true; 
        currentMove [32][13] = true;
        currentMove [23][14] = true;
        currentMove [24][14] = true; 
        currentMove [25][14] = true; 
        currentMove [26][14] = true; 
        currentMove [27][14] = true; 
        currentMove [30][14] = true; 
        currentMove [31][14] = true; 
        currentMove [32][14] = true; 
        currentMove [33][14] = true; 
        currentMove [34][14] = true; 
        currentMove [21][15] = true; 
        currentMove [21][15] = true; 
        currentMove [22][15] = true; 
        currentMove [23][15] = true; 
        currentMove [24][15] = true; 
        currentMove [25][15] = true; 
        currentMove [26][15] = true; 
        currentMove [27][15] = true; 
        currentMove [30][15] = true; 
        currentMove [31][15] = true; 
        currentMove [32][15] = true; 
        currentMove [33][15] = true; 
        currentMove [34][15] = true; 
        currentMove [35][15] = true; 
        currentMove [36][15] = true; 
        currentMove [20][16] = true;
        currentMove [21][16] = true;
        currentMove [22][16] = true;
        currentMove [23][16] = true;
        currentMove [24][16] = true;
        currentMove [25][16] = true;
        currentMove [26][16] = true;
        currentMove [27][16] = true;
        currentMove [30][16] = true;
        currentMove [31][16] = true;
        currentMove [32][16] = true;
        currentMove [33][16] = true;
        currentMove [34][16] = true;
        currentMove [35][16] = true;
        currentMove [36][16] = true;
        currentMove [37][16] = true;
        currentMove [19][17] = true;
        currentMove [20][17] = true;
        currentMove [21][17] = true;
        currentMove [22][17] = true;
        currentMove [23][17] = true;
        currentMove [24][17] = true;
        currentMove [25][17] = true;
        currentMove [26][17] = true;
        currentMove [27][17] = true;
        currentMove [30][17] = true;
        currentMove [31][17] = true;
        currentMove [32][17] = true;
        currentMove [33][17] = true;
        currentMove [34][17] = true;
        currentMove [35][17] = true;
        currentMove [36][17] = true;
        currentMove [37][17] = true;
        currentMove [38][17] = true;
        currentMove [18][18] = true;
        currentMove [19][18] = true;
        currentMove [20][18] = true;
        currentMove [21][18] = true;
        currentMove [22][18] = true;
        currentMove [23][18] = true;
        currentMove [24][18] = true;
        currentMove [25][18] = true;
        currentMove [26][18] = true;
        currentMove [27][18] = true;
        currentMove [30][18] = true;
        currentMove [31][18] = true;
        currentMove [32][18] = true;
        currentMove [33][18] = true;
        currentMove [34][18] = true;
        currentMove [35][18] = true;
        currentMove [36][18] = true;
        currentMove [37][18] = true;
        currentMove [38][18] = true;
        currentMove [39][18] = true;
        currentMove [17][19] = true;
        currentMove [18][19] = true;
        currentMove [19][19] = true;
        currentMove [20][19] = true;
        currentMove [21][19] = true;
        currentMove [22][19] = true;
        currentMove [23][19] = true;
        currentMove [24][19] = true;
        currentMove [25][19] = true;
        currentMove [26][19] = true;
        currentMove [27][19] = true;
        currentMove [30][19] = true;
        currentMove [31][19] = true;
        currentMove [32][19] = true;
        currentMove [33][19] = true;
        currentMove [34][19] = true;
        currentMove [35][19] = true;
        currentMove [36][19] = true;
        currentMove [37][19] = true;
        currentMove [38][19] = true;
        currentMove [39][19] = true;
        currentMove [40][19] = true;
        currentMove [16][20] = true;
        currentMove [17][20] = true;
        currentMove [18][20] = true;
        currentMove [19][20] = true;
        currentMove [20][20] = true;
        currentMove [21][20] = true;
        currentMove [22][20] = true;
        currentMove [23][20] = true;
        currentMove [24][20] = true;
        currentMove [25][20] = true;
        currentMove [26][20] = true;
        currentMove [27][20] = true;
        currentMove [30][20] = true;
        currentMove [31][20] = true;
        currentMove [32][20] = true;
        currentMove [33][20] = true;
        currentMove [34][20] = true;
        currentMove [35][20] = true;
        currentMove [36][20] = true;
        currentMove [37][20] = true;
        currentMove [38][20] = true;
        currentMove [39][20] = true;
        currentMove [40][20] = true;
        currentMove [41][20] = true;
        currentMove [16][21] = true;
        currentMove [17][21] = true;
        currentMove [18][21] = true;
        currentMove [19][21] = true;
        currentMove [20][21] = true;
        currentMove [21][21] = true;
        currentMove [22][21] = true;
        currentMove [23][21] = true;
        currentMove [24][21] = true;
        currentMove [25][21] = true;
        currentMove [26][21] = true;
        currentMove [27][21] = true;
        currentMove [30][21] = true;
        currentMove [31][21] = true;
        currentMove [32][21] = true;
        currentMove [33][21] = true;
        currentMove [34][21] = true;
        currentMove [35][21] = true;
        currentMove [36][21] = true;
        currentMove [37][21] = true;
        currentMove [38][21] = true;
        currentMove [39][21] = true;
        currentMove [40][21] = true;
        currentMove [41][21] = true;
        currentMove [15][22] = true;
        currentMove [16][22] = true;
        currentMove [17][22] = true;
        currentMove [18][22] = true;
        currentMove [19][22] = true;
        currentMove [20][22] = true;
        currentMove [21][22] = true;
        currentMove [22][22] = true;
        currentMove [23][22] = true;
        currentMove [24][22] = true;
        currentMove [25][22] = true;
        currentMove [26][22] = true;
        currentMove [27][22] = true;
        currentMove [30][22] = true;
        currentMove [31][22] = true;
        currentMove [32][22] = true;
        currentMove [33][22] = true;
        currentMove [34][22] = true;
        currentMove [35][22] = true;
        currentMove [36][22] = true;
        currentMove [37][22] = true;
        currentMove [38][22] = true;
        currentMove [39][22] = true;
        currentMove [40][22] = true;
        currentMove [41][22] = true;
        currentMove [42][22] = true;
        currentMove [15][23] = true;
        currentMove [16][23] = true;
        currentMove [17][23] = true;
        currentMove [18][23] = true;
        currentMove [19][23] = true;
        currentMove [20][23] = true;
        currentMove [21][23] = true;
        currentMove [22][23] = true;
        currentMove [23][23] = true;
        currentMove [24][23] = true;
        currentMove [25][23] = true;
        currentMove [26][23] = true;
        currentMove [27][23] = true;
        currentMove [30][23] = true;
        currentMove [31][23] = true;
        currentMove [32][23] = true;
        currentMove [33][23] = true;
        currentMove [34][23] = true;
        currentMove [35][23] = true;
        currentMove [36][23] = true;
        currentMove [37][23] = true;
        currentMove [38][23] = true;
        currentMove [39][23] = true;
        currentMove [40][23] = true;
        currentMove [41][23] = true;
        currentMove [42][23] = true;    
        currentMove [15][24] = true;
        currentMove [16][24] = true;
        currentMove [17][24] = true;
        currentMove [18][24] = true;
        currentMove [19][24] = true;
        currentMove [20][24] = true;
        currentMove [21][24] = true;
        currentMove [22][24] = true;
        currentMove [23][24] = true;
        currentMove [24][24] = true;
        currentMove [25][24] = true;
        currentMove [26][24] = true;
        currentMove [27][24] = true;
        currentMove [30][24] = true;
        currentMove [31][24] = true;
        currentMove [32][24] = true;
        currentMove [33][24] = true;
        currentMove [34][24] = true;
        currentMove [35][24] = true;
        currentMove [36][24] = true;
        currentMove [37][24] = true;
        currentMove [38][24] = true;
        currentMove [39][24] = true;
        currentMove [40][24] = true;
        currentMove [41][24] = true;
        currentMove [42][24] = true; 
        currentMove [15][25] = true;
        currentMove [16][25] = true;
        currentMove [17][25] = true;
        currentMove [18][25] = true;
        currentMove [19][25] = true;
        currentMove [20][25] = true;
        currentMove [21][25] = true;
        currentMove [22][25] = true;
        currentMove [23][25] = true;
        currentMove [24][25] = true;
        currentMove [25][25] = true;
        currentMove [26][25] = true;
        currentMove [27][25] = true;
        currentMove [30][25] = true;
        currentMove [31][25] = true;
        currentMove [32][25] = true;
        currentMove [33][25] = true;
        currentMove [34][25] = true;
        currentMove [35][25] = true;
        currentMove [36][25] = true;
        currentMove [37][25] = true;
        currentMove [38][25] = true;
        currentMove [39][25] = true;
        currentMove [40][25] = true;
        currentMove [41][25] = true;
        currentMove [42][25] = true;
        currentMove [15][26] = true;
        currentMove [16][26] = true;
        currentMove [17][26] = true;
        currentMove [18][26] = true;
        currentMove [19][26] = true;
        currentMove [20][26] = true;
        currentMove [21][26] = true;
        currentMove [22][26] = true;
        currentMove [23][26] = true;
        currentMove [24][26] = true;
        currentMove [25][26] = true;
        currentMove [26][26] = true;
        currentMove [27][26] = true;
        currentMove [30][26] = true;
        currentMove [31][26] = true;
        currentMove [32][26] = true;
        currentMove [33][26] = true;
        currentMove [34][26] = true;
        currentMove [35][26] = true;
        currentMove [36][26] = true;
        currentMove [37][26] = true;
        currentMove [38][26] = true;
        currentMove [39][26] = true;
        currentMove [40][26] = true;
        currentMove [41][26] = true;
        currentMove [42][26] = true;
        currentMove [15][27] = true;
        currentMove [16][27] = true;
        currentMove [17][27] = true;
        currentMove [18][27] = true;
        currentMove [19][27] = true;
        currentMove [20][27] = true;
        currentMove [24][27] = true;
        currentMove [25][27] = true;
        currentMove [26][27] = true;
        currentMove [27][27] = true;
        currentMove [30][27] = true;
        currentMove [31][27] = true;
        currentMove [32][27] = true;
        currentMove [33][27] = true;
        currentMove [34][27] = true;
        currentMove [35][27] = true;
        currentMove [36][27] = true;
        currentMove [37][27] = true;
        currentMove [38][27] = true;
        currentMove [39][27] = true;
        currentMove [40][27] = true;
        currentMove [41][27] = true;
        currentMove [42][27] = true;
        currentMove [15][28] = true;
        currentMove [16][28] = true;
        currentMove [17][28] = true;
        currentMove [18][28] = true;
        currentMove [19][28] = true;
        currentMove [21][28] = true;
        currentMove [22][28] = true;
        currentMove [23][28] = true;
        currentMove [25][28] = true;
        currentMove [26][28] = true;
        currentMove [27][28] = true;
        currentMove [30][28] = true;
        currentMove [31][28] = true;
        currentMove [32][28] = true;
        currentMove [33][28] = true;
        currentMove [34][28] = true;
        currentMove [35][28] = true;
        currentMove [36][28] = true;
        currentMove [37][28] = true;
        currentMove [38][28] = true;
        currentMove [39][28] = true;
        currentMove [40][28] = true;
        currentMove [41][28] = true;
        currentMove [42][28] = true;
        currentMove [15][29] = true;
        currentMove [16][29] = true;
        currentMove [17][29] = true;
        currentMove [18][29] = true;
        currentMove [20][29] = true;
        currentMove [22][29] = true;
        currentMove [24][29] = true;
        currentMove [26][29] = true;
        currentMove [27][29] = true;
        currentMove [30][29] = true;
        currentMove [31][29] = true;
        currentMove [32][29] = true;
        currentMove [33][29] = true;
        currentMove [34][29] = true;
        currentMove [35][29] = true;
        currentMove [36][29] = true;
        currentMove [37][29] = true;
        currentMove [38][29] = true;
        currentMove [39][29] = true;
        currentMove [40][29] = true;
        currentMove [41][29] = true;
        currentMove [42][29] = true; 
        currentMove [16][30] = true;
        currentMove [17][30] = true;
        currentMove [18][30] = true;
        currentMove [20][30] = true;
        currentMove [21][30] = true;   
        currentMove [23][30] = true;
        currentMove [24][30] = true;
        currentMove [26][30] = true;
        currentMove [27][30] = true;
        currentMove [30][30] = true;
        currentMove [31][30] = true;
        currentMove [32][30] = true;
        currentMove [33][30] = true;
        currentMove [34][30] = true;
        currentMove [35][30] = true;
        currentMove [36][30] = true;
        currentMove [37][30] = true;
        currentMove [38][30] = true;
        currentMove [39][30] = true;
        currentMove [40][30] = true;
        currentMove [41][30] = true;
        currentMove [16][31] = true;
        currentMove [17][31] = true;
        currentMove [18][31] = true;
        currentMove [20][31] = true;
        currentMove [22][31] = true;
        currentMove [24][31] = true;
        currentMove [26][31] = true;
        currentMove [27][31] = true;
        currentMove [30][31] = true;
        currentMove [31][31] = true;
        currentMove [32][31] = true;
        currentMove [33][31] = true;
        currentMove [34][31] = true;
        currentMove [35][31] = true;
        currentMove [36][31] = true;
        currentMove [37][31] = true;
        currentMove [38][31] = true;
        currentMove [39][31] = true;
        currentMove [40][31] = true;
        currentMove [41][31] = true;
        currentMove [17][32] = true;
        currentMove [18][32] = true;
        currentMove [19][32] = true;
        currentMove [21][32] = true;
        currentMove [22][32] = true;
        currentMove [23][32] = true;
        currentMove [25][32] = true;
        currentMove [26][32] = true;
        currentMove [27][32] = true;
        currentMove [30][32] = true;
        currentMove [31][32] = true;
        currentMove [32][32] = true;
        currentMove [33][32] = true;
        currentMove [34][32] = true;
        currentMove [35][32] = true;
        currentMove [36][32] = true;
        currentMove [37][32] = true;
        currentMove [38][32] = true;
        currentMove [39][32] = true;
        currentMove [40][32] = true;
        currentMove [18][33] = true;
        currentMove [19][33] = true;
        currentMove [20][33] = true;
        currentMove [24][33] = true;
        currentMove [25][33] = true;
        currentMove [26][33] = true;
        currentMove [27][33] = true;
        currentMove [30][33] = true;
        currentMove [31][33] = true;
        currentMove [32][33] = true;
        currentMove [33][33] = true;
        currentMove [34][33] = true;
        currentMove [35][33] = true;
        currentMove [36][33] = true;
        currentMove [37][33] = true;
        currentMove [38][33] = true;
        currentMove [39][33] = true;
        currentMove [19][34] = true;
        currentMove [20][34] = true;
        currentMove [21][34] = true;
        currentMove [22][34] = true;
        currentMove [23][34] = true;
        currentMove [24][34] = true;
        currentMove [25][34] = true;
        currentMove [26][34] = true;
        currentMove [27][34] = true;
        currentMove [30][34] = true;
        currentMove [31][34] = true;
        currentMove [32][34] = true;
        currentMove [33][34] = true;
        currentMove [34][34] = true;
        currentMove [35][34] = true;
        currentMove [36][34] = true;
        currentMove [37][34] = true;
        currentMove [38][34] = true;
        currentMove [20][35] = true;
        currentMove [21][35] = true;
        currentMove [22][35] = true;
        currentMove [23][35] = true;
        currentMove [24][35] = true;
        currentMove [25][35] = true;
        currentMove [26][35] = true;
        currentMove [27][35] = true;
        currentMove [30][35] = true;
        currentMove [31][35] = true;
        currentMove [32][35] = true;
        currentMove [33][35] = true;
        currentMove [34][35] = true;
        currentMove [35][35] = true;
        currentMove [36][35] = true;
        currentMove [37][35] = true;
        currentMove [21][36] = true;
        currentMove [22][36] = true;
        currentMove [23][36] = true;
        currentMove [24][36] = true;
        currentMove [25][36] = true;
        currentMove [26][36] = true;
        currentMove [27][36] = true;
        currentMove [30][36] = true;
        currentMove [31][36] = true;
        currentMove [32][36] = true;
        currentMove [33][36] = true;
        currentMove [34][36] = true;
        currentMove [35][36] = true;
        currentMove [36][36] = true;
        currentMove [23][37] = true;
        currentMove [24][37] = true;
        currentMove [25][37] = true;
        currentMove [26][37] = true;
        currentMove [27][37] = true;
        currentMove [30][37] = true;
        currentMove [31][37] = true;
        currentMove [32][37] = true;
        currentMove [33][37] = true;
        currentMove [34][37] = true;
        currentMove [25][38] = true;
        currentMove [26][38] = true;
        currentMove [27][38] = true;
        currentMove [30][38] = true;
        currentMove [31][38] = true;
        currentMove [32][38] = true;
          
     }//End Of Death Star
     
     /**
      * Generates a custom Noting Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Nothing).
      */
         //Nothing pattern 
     public static void generateNothing(boolean currentMove[][]){
         // [row][collum]
     
     }//End Of Nothing
     
     /**
      * Generates a custom Mega man Pattern.
      * @param currentMove Waits for choice box click to be performed before running this method (ChoiceBox Nothing).
      */
      public static void generateMegaMan(boolean currentMove[][]){
         // [row][collum]
         currentMove [37][10] = true;
         currentMove [38][10] = true;
         currentMove [36][11] = true;
         currentMove [38][11] = true;
         currentMove [36][12] = true;
         currentMove [38][12] = true;
         currentMove [24][13] = true;
         currentMove [25][13] = true;
         currentMove [26][13] = true;
         currentMove [35][13] = true;
         currentMove [38][13] = true;
         currentMove [23][14] = true;
         currentMove [27][14] = true;
         currentMove [35][14] = true;
         currentMove [38][14] = true;
         currentMove [22][15] = true;
         currentMove [28][15] = true;
         currentMove [34][15] = true;
         currentMove [38][15] = true;
         currentMove [22][16] = true;
         currentMove [29][16] = true;
         currentMove [33][16] = true;
         currentMove [38][16] = true;
         currentMove [21][17] = true;
         currentMove [30][17] = true;
         currentMove [32][17] = true;
         currentMove [38][17] = true;
         currentMove [21][18] = true;
         currentMove [30][18] = true;
         currentMove [31][18] = true;
         currentMove [37][18] = true;
         currentMove [38][18] = true;
         currentMove [20][19] = true;
         currentMove [21][19] = true;
         currentMove [22][19] = true;
         currentMove [36][19] = true;
         currentMove [18][20] = true;
         currentMove [19][20] = true;
         currentMove [23][20] = true;
         currentMove [24][20] = true;
         currentMove [35][20] = true;
         currentMove [17][21] = true;
         currentMove [25][21] = true;
         currentMove [34][21] = true;
         currentMove [16][22] = true;
         currentMove [26][22] = true;
         currentMove [34][22] = true;
         currentMove [37][22] = true;
         currentMove [38][22] = true;
         currentMove [16][23] = true;
         currentMove [27][23] = true;
         currentMove [35][23] = true;
         currentMove [36][23] = true;
         currentMove [38][23] = true;
         currentMove [15][24] = true;
         currentMove [16][24] = true;
         currentMove [25][24] = true;
         currentMove [27][24] = true;
         currentMove [38][24] = true;
         currentMove [15][25] = true;
         currentMove [17][25] = true;
         currentMove [22][25] = true;
         currentMove [23][25] = true;
         currentMove [25][25] = true;
         currentMove [27][25] = true;
         currentMove [38][25] = true;
         currentMove [15][26] = true;
         currentMove [18][26] = true;
         currentMove [19][26] = true;
         currentMove [22][26] = true;
         currentMove [23][26] = true;
         currentMove [25][26] = true;
         currentMove [27][26] = true;
         currentMove [31][26] = true;
         currentMove [32][26] = true;
         currentMove [33][26] = true;
         currentMove [36][26] = true;
         currentMove [38][26] = true;
         currentMove [16][27] = true;
         currentMove [18][27] = true;
         currentMove [20][27] = true;
         currentMove [25][27] = true;
         currentMove [27][27] = true;
         currentMove [29][27] = true;
         currentMove [33][27] = true;
         currentMove [36][27] = true;
         currentMove [38][27] = true;
         currentMove [17][28] = true;
         currentMove [18][28] = true;
         currentMove [20][28] = true;
         currentMove [22][28] = true;
         currentMove [23][28] = true;
         currentMove [26][28] = true;
         currentMove [28][28] = true;
         currentMove [34][28] = true;
         currentMove [35][28] = true;
         currentMove [36][28] = true;
         currentMove [38][28] = true;
         currentMove [18][29] = true;
         currentMove [25][29] = true;
         currentMove [28][29] = true;
         currentMove [36][29] = true;
         currentMove [38][29] = true;
         currentMove [19][30] = true;
         currentMove [20][30] = true;
         currentMove [21][30] = true;
         currentMove [22][30] = true;
         currentMove [23][30] = true;
         currentMove [24][30] = true;
         currentMove [25][30] = true;
         currentMove [28][30] = true;
         currentMove [37][30] = true;
         currentMove [38][30] = true;
         currentMove [24][31] = true;
         currentMove [28][31] = true;
         currentMove [24][32] = true;
         currentMove [28][32] = true;
         currentMove [24][33] = true;
         currentMove [25][33] = true;
         currentMove [26][33] = true;
         currentMove [27][33] = true;
         currentMove [23][34] = true;
         currentMove [28][34] = true;
         currentMove [23][35] = true;
         currentMove [28][35] = true;
         currentMove [23][36] = true;
         currentMove [28][36] = true;
         currentMove [23][37] = true;
         currentMove [24][37] = true;
         currentMove [27][37] = true;
         currentMove [28][37] = true;
         currentMove [24][38] = true;
         currentMove [25][38] = true;
         currentMove [26][38] = true;
         currentMove [27][38] = true;
         currentMove [24][39] = true;
         currentMove [27][39] = true;
         currentMove [25][40] = true;
         currentMove [26][40] = true;
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
       
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }//End Of Nothing
}//End Of Class
