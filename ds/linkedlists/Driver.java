import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
     l.add("f");
     l.add("e");
     l.add("d");
     l.add("c");
     l.add("b");
     l.add("a");
     l.add(3,"z");
     //l.remove(2);
  
     System.out.println(l);
     System.out.println(l.indexOf("c"));
     System.out.println(l.size());
     System.out.println(l.get(2));
     //System.out.println(l.remove(2));
    

      System.out.print("[");
      for (int i = 0; i < l.toArray().length; i++) 
      {
     System.out.print(l.toArray()[i]);
      }
        System.out.println("]");



    
  }
}