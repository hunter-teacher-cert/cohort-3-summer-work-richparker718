import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Craps{

 public static void gameInstructions(){
newLine();
System.out.println("GAME INSTRUCTIONS:");  
System.out.print("A round is played by rolling the dice. ");
System.out.print("If a 2,3, or 12 is rolled that’s Craps and you lose. ");   
System.out.print("If a 7 or 11 is rolled it's Natural and you win, ");   
System.out.print("otherwise the value rolled is the Point. ");  
System.out.println("Continue to shoot until you either roll the Point again (win) or roll a 7 (lose).");
newLine();
newLine();
 }
  


public static void newLine(){
 System.out.println();
  }

public static int roll(int a){
Random random = new Random();
int n= random.nextInt(a)+1;
 return n;
}
  
public static void pauseToContinue(){
  Scanner in = new Scanner(System.in);
  in.nextLine();
  }

public static int shoot(int a, int b){
  pauseToContinue();
  int c = roll(b)+roll(b);
  return c;
}

 public static void round() {
   int i =1;
   int a = shoot(2,6);
   System.out.println("roll " + i +": " +a);
  
   if (a==2||a==3||a==12){
     System.out.println("CRAPS, YOU LOSE!");
     
   } else if(a==7||a==11){
     System.out.println("NATURAL, YOU WIN!");
     
   }else{
     System.out.println("Your Point is: " +a );
     int point =a;
     int b=shoot(2,6);
     i++;
     System.out.println("roll " + i +": " +b);
     
     boolean end = false;
     
      while(end==false){
        
      if(point==b){
       System.out.println("YOU WIN!");
       end = true;
        
     }else if (b==7){
       System.out.println("YOU LOSE!");
       end = true;
        
     } else{
       b = shoot(2,6);
       i++;
       System.out.println("roll " + i +": " +b);
        
     }
   }
     }
      }
   
public static void main(String[] args){
    gameInstructions();
    for (int i=1; i<= Integer.parseInt(args[0]); i++){
    System.out.println("ROUND " +i); System.out.println("press return to roll dice");
    round();
    newLine();
    newLine();
    newLine();

}
  }
}