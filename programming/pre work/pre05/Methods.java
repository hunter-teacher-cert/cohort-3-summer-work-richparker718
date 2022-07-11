import java.io.*;
import java.util.*;

public class Methods {

public static boolean isDivisible(int m, int n){
  return (m % n == 0);
}
public static boolean isTriangle(int a, int b, int c){
  return !(( a > b + c) || (b > a + c) || (c > a + b));
  }
 public static int ackerman(int m, int n) {
   if (m == 0) {
     return (n + 1);
   } else if (m > 0 && n == 0) {
     return ackerman(m - 1, 1);
   } else {
     return ackerman(m - 1, ackerman(m, n - 1));
   }
 
 } 
   
  public static void main(String[] args)
  {
   System.out.println(isTriangle(2,3,2));
   System.out.println(isDivisible(24,12));
   System.out.println(ackerman(3,6));
  }
  }
  