;import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Richard Parker 
 * collaborators: Marisa, Wil, Elizabeth
 */


public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  public static void printBoard( char[][] board )
  {
    for(int i=0; i<board.length; i++){
     
     for(int j=0; j<board[i].length; j++){
        System.out.print(" "+ board[i][j]);
    }
          System.out.println();
    }
  }

  public static void setRow( char[][] board, int row, char 
  value )
  {
    for(int i=0; i<board.length; i++){
    
      
      for(int j=0; j<board[i].length; j++){
        if(row==i){
        board[i][j]= value;
      }}
      
    }
  }

  public static char[][] copyBoard( char[][] original )
  {
    char [][] copy;
    copy = new char [original.length][];
    for(int i=0; i<original.length; i++){
      copy[i]= new char [original[i].length];
      for(int j=0; j<original[i].length; j++){
        copy[i][j]= original[i][j];
      }
    
    }
    return copy;
 }

  public static void explodeSquare( char[][] board, int row, int col )
  {
  
   for(int i=row-1; i<=row +1; i++){
    if(i>=0 && i<board.length){
    
    for (int j =col-1; j<=col +1; j++){
     if(j>=0 &&j<board[0].length){
      if(i != row || j != col){
        board [i][j]='X';
}
}
}
}
}
  }

  public static void explodeAllChar(char[][] board, char c)
  {
    for(int i=0; i<board.length; i++){
      
      for(int j=0; j<board[i].length; j++){
        if (c==board[i][j]){
          explodeSquare(board,i,j); 
        }   
      }
    }
  }

  public static void downString( char[][] board, int row, int col, String word )
  {
    int k = 0;
    char aString = word.charAt(k);
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board[i].length; j++){
        if(i==row && j==col && k<word.length()){
        board [i][j]= word.charAt(k);
          k++;
          row++;  
       }
      } 
     }
    }

  public static void main( String[] args )
  {
    
    char[][] b = buildBoard(5,10,'z');
    char[][] b2= buildBoard(5,10,'m');
    char[][] b3= buildBoard(5,10,'q');
    b3[3][2]= 'z';
    b3[1][7]= 'z';
    char[][] b4 = buildBoard(5,10,'b');
    char[][] b5 = buildBoard(5,10,'o');
    char[][] b6 = buildBoard(7,6,'x');
    char[][] b7 = buildBoard(7,6,'x');
    b7[1][1] = 'H';
    b7[2][1] = 'E';
    b7[3][1] = 'L';
    b7[4][1] = 'L';
    b7[5][1] = 'O';
        
    printBoard(b);
    System.out.println();
    explodeSquare(b2,2,2);
    printBoard(b2);
    System.out.println();
    explodeAllChar(b3,'z');
    printBoard(b3);
    System.out.println();
    setRow(b4,1,'@');
    printBoard(b4);
    System.out.println();
    printBoard(copyBoard(b5));
    System.out.println();
    downString(b6,1,1,"HELLO");
    printBoard(b6);
    System.out.println();
    downString(b7,4,3,"WORLD");
    printBoard(b7);
  }
}