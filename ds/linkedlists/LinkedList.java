import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;
  
  public LinkedList(){
    head = null;
  }

  public void add(String value){
    head = new Node(value,head);
  }

  public String get(int index){
    int i =0;
    Node walker = head;
    while (i<=index){
      if(i==index){
        break;
      }
      walker = walker.getNext();
      i++;
      
    }
    return walker.getData();
  }

  public String toString(){
    String s = "";
    Node walker = head;
    while (walker != null){
      s = s + walker.getData();
      walker = walker.getNext();
    }
    
    return s;
  }

  public int size(){
    int i=0;
    Node walker = head;
    while (walker != null){
      i++;
      walker = walker.getNext();
    }
    return i;
  }

  public void add(int index, String value){
    Node walker = head;
    Node nNode = new Node (value, null);
    int target =1;
    //Node temp = null;

    if (index<0 || index > size()){
      System.out.println("Out of bounds");
    } else if (index == 0){
       add(value);
    } else {

    while (target<index){
      walker = walker.getNext();
      target++;
    }
      nNode.setNext(walker.getNext());
      walker.setNext(nNode);
    }
  }

  public int indexOf(String value){
    Node walker = head;
    int i = 0;
  
    while (walker != null){
      
      if (walker.getData() == value){
        break;
      } 
      walker = walker.getNext();
      i++;
    }
    return i;
  }

  public String[] toArray(){
       
  Node front = head;
    int j = 0;
    while(front != null){
      j++;
      front = front.getNext();
    }
    String [] nArray = new String [j];
    
    Node walker = head;
       int i = 0;
    while(walker != null){
        nArray[i]= walker.getData();
        walker = walker.getNext();  
        i++;
      }
    return nArray;
  }

  public void remove(int index){
    Node walker = head;
    int target =1;

    while (target<index){
      walker = walker.getNext();
      target++;
    }
      walker.setNext(walker.getNext().getNext());
      
  }
}