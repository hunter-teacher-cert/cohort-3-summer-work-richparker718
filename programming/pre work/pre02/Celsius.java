import java.util.Scanner;


public class Celsius{

  public static void main(String[] args){
  
  double celsius;
  Scanner in = new Scanner(System.in);

  System.out.print("Temperature in Celsius?  ");
  celsius = in.nextDouble();
  
  double fahrenheit = ((celsius * 1.8) + 32);

  System.out.printf("%.2f C = %.2f F", celsius, fahrenheit);

  }
}