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

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    head = new Node(value,head);
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    int i =0;
    Node walker = head;
    while (i<=index){
      if(i==index){
        break;
      }
      walker = walker.getNext();
      i++;
      //get data from the node at an index given by the user
    }
    return walker.getData();
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String s = "";
    Node walker = head;
    while (walker != null){
      s = s + walker.getData();
      walker = walker.getNext();
    }
    
    return s;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    int i=0;
    Node walker = head;
    while (walker != null){
      i++;
      walker = walker.getNext();
    }
    return i;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */

  
  public void add(int index, String value){
    Node walker = head;
    Node nNode = new Node (value, null);
    int target =1;
    //Node temp = null;

    while (target<index){
      walker = walker.getNext();
      target++;
    }
      nNode.setNext(walker.getNext());
      walker.setNext(nNode);
    }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    Node walker = head;
    int i = 0;
  
    while (walker != null){
      // while (walker.getData() != value && walker != null){
      // walker = walker.getNext();
      // i++;
      //}
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