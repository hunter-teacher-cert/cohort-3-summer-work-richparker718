import java.util.Random;
import java.util.Scanner;

public class Guess 

{
  public static void main(String[] args){
    
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    Scanner in = new Scanner(System.in);
    
    System.out.println("I'm thinking of a number between 1-100 (including both). Can you guess the number?");
    
    System.out.print("Type a number:  ");
    int guess = in.nextInt();
    
    System.out.println("Your guess is:  " + guess);
    
    System.out.println("The number I was thinking of is:  " + number);

   int difference = number - guess;

    if (difference < 0){
      difference = difference * -1;
      System.out.println("You were off by:  " + difference);
    } else if (difference > 0){
      System.out.println("You were off by:  " + difference);
    } else {
      System.out.println("You correctly guessed the number!");

    }
    
  }
}