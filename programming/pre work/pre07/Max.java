import java.io.*;
import java.util.*;

public class Max{

public static int indexOfMax(int[]a) {
    
    int n = a[0];
    int max = 0;

    for (int i =0; i < a.length; i++){
      if(a[i] > n){
        n=a[i];
        max=i;
      }
    }
       System.out.println(max);
    return max;
    }
  public static void main(String [] args){
     
    int[] a= {2,1,2550,6,453,100,2201,5,30,65};
    indexOfMax(a);
  }
  
}
 


