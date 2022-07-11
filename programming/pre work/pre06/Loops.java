import java.io.*;
import java.util.*;


public class Loops{

  public static double power(double x, int n) {
    
    double base = x;
    
    if (n == 0) {
     return 1;

    } else {
      for (int i = 1; i < n; i = i + 1){
       x = x * base;
      }
      return x;
    }}


    public static int factorial(int n) {
    
    int result = 1;
        
      for (int i = n; i > 1; i = i - 1) {
      
       result = n * (i-1);
       n = result;
       
      }
      return result;
      }
    

    public static double myexp(double x, int n){
      double sum = 1;
      int i = 1;
      double result = 1;

      for (i = 1; i <= n; i++){
        result = power(x,i)/factorial(i);
        sum = result + sum;
        
      }
      return sum;
    }

    public static double myexp2(double x, int n){
      double sum = 1;
      int i = 1;
      double result = 1;

      double Numer = x;
      int Denom = i;
      double nNumer = 1;
      int nDenom = 1;

      for (i = 1; i <=n; i++){
       
       Numer = nNumer;
       Denom = nDenom;
       nNumer = Numer * x;
       nDenom = Denom * i;

      result = nNumer/nDenom;
      
      sum = result + sum;
        
      }
      return sum;
    }
  
  public static void check(double x){
    System.out.println(x + "\t" + "\t" + myexp(x,4) + "\t"  + 
     Math.exp(x));

  }


  public static void main(String[] args){
      
     double i = 0.1;
       while (i < 101.0) {
         check(i);
         i = i * 10;
      }

     System.out.println();

       double n = -0.1;
       while (n > -101.0) {
         System.out.println(myexp2(n,2));
          n = n * 10;
      }
     // the values from negative arguments are less accurate than 
     //  positive arguments

      System.out.println();
        
      System.out.println(power(1.5,3));
      System.out.println(factorial(7));
      System.out.println(myexp(2,6));
      System.out.println(myexp2(2,6));
      check(1);
}
}