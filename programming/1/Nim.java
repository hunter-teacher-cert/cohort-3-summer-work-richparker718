import java.io.*;
import java.util.*;
import java.util.Random;

public class Nim {

  public static String pluralOrNot (int machineTurn) {
      return (machineTurn == 1) ? "stone":"stones";
    }

  public static String pluralOrNot2 (int stones) {
      return (stones == 1) ? "stone":"stones";
    }

  public static String whichVerb (int stones) {
      return (stones == 1) ? "is":"are";
    }

  public static void main (String [] args){
    int stones = 12;
    int stonesTaken = 0;
    int machineTurn = 3;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);


    while(stones > 0){
      
      System.out.print("How many stones do you want to take? ");
      stonesTaken = input.nextInt();
      
      if (stonesTaken < 1 || stonesTaken > 3){
        System.out.println("Pick between 1 and 3");   
      }
      else
      {
        
     stones = stones - stonesTaken;
      
        if (stones == 0) {
          System.out.println("Player wins!");
          System.exit(0);  
        }

        
      System.out.println("There " + whichVerb (stones) + " " + stones + " " + pluralOrNot2 (stones) + " remaning");

        if (stones >= 3){
      machineTurn = rand.nextInt(3)+ 1;
        } else {
          if (stones==2){
            machineTurn = 2;
          } else {
            machineTurn = 1;
          }
        }
        
        System.out.println("The computer picks " + machineTurn + " " + pluralOrNot (machineTurn));
        
        stones = stones - machineTurn;

         if (stones == 0) {
          System.out.println("Computer wins!");
          System.exit(0);
          
        }
        
        System.out.println("There " + whichVerb (stones) + " " + stones + " " + pluralOrNot2 (stones) + " remaning");

} 
      
    }
}
}
