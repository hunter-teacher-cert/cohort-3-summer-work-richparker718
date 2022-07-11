import java.io.*;
import java.util.*;


public class Array{
  

public static double[] powArray(double[] a, double b){
    for(int i= 0; i<a.length; i++){ 
     System.out.print(Math.pow(a[i], 2.0) +" ");
}     
    System.out.println();

       for(int i= 0; i<a.length; i++){
         System.out.print(Math.pow(a[i], b) +" ");
       } 
       return a;
}  

public static int [] scores(int a){
      Random random = new Random();
       int[] n = new int [a];
        for(int i=0; i<n.length;i++){
         n[i] = random.nextInt(a);
     }
    System.out.println(Arrays.toString(n));
     return n;  
}

 public static int[] histogram(int[] scores, int a){
    
    int [] counter = new int[a]; 
  
     for (int score : scores){
      counter[score]++;
    
 }
    System.out.println(Arrays.toString(counter));
     return counter;
 }


public static void main(String[] args){
 
 double[] a= {3.0,4.0,5.0,6.0,7.0};
 double b = 3.0; 
 powArray(a,b);
 System.out.println();
 histogram(scores(100),100);

} 
}