import java.io.*;
import java.util.*;


public class Sieve {

public static void printPrime(boolean[] a){
  
  for (int i=0; i<a.length; i++){
    System.out.println(i +" is prime: " + a[i]);
  }
}

public static boolean[] sieve(int n){

  boolean [] prime = new boolean [n+1];
  prime[0] = false;
  prime[1] = false;
  
for (int k= 2; k<n+1; k++){
  prime[k] = true;
}
  for(int a = 2; a<n+1; a++){
   for(int i= 2; i<=n/2; i++){
     int  j = a*i;
      if(j<prime.length){
       prime[j] = false;
  }
  }}
  
  printPrime(prime);

   return prime;
}
 
public static void main(String[] args){
sieve(250);
}



}