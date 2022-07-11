/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: Seth Adams, Jihae Park, Rachel Kaufman
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    int[] data = new int[size];
    numberElements =0;
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    data = new int[10];
    numberElements =0;
    
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    if (numberElements == data.length)
    {
      grow();
    }
    data[numberElements] = value;
    numberElements ++;
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    
    /* YOUR SIMPLE+SMART CODE HERE */

//data[numberElements] = value;
    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */

  }//end add()
  

  public boolean isEmpty()
  {
      return numberElements==0;
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public int get(int index)
  {
    if (index>numberElements){
      System.out.println("Index numbers have no meaning");
    }
    return data[index];
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public String toString(){
  String arrayString = "[ ";
  for(int i=0; i<numberElements; i++){
     arrayString += (data[i] + " ");
    
    
    }
    arrayString += "]";
    
       return arrayString;
    }
  
  //arrayString = "["
  //for loop through th eitems
  //append to string array[i] + " "
  //end loop
  //return arrayString
  
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
  //end toString()

  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)

  
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    
    
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */

    // subtract fom numElements;
    
    /* YOUR SIMPLE+SMART CODE HERE */
   if (index>numberElements-1){
     System.out.println("Index doesn't contain valuable data");
    
    }else{
    for(int i= index +1; i<numberElements; i++){
    
      data[i]=data[i+1];
    }
    //data[numberElements -1] = 0;
    numberElements --;
  }

  }
  public void add(int index, int value)
  {
    if(numberElements ==data.length){
      grow();
    }
    if(index>numberElements){
      System.out.println("Index is out of bounds");
    }else{
      for(int i= numberElements; i>index; i--){
        data[i]=data[i-1];
      }
      data[index]=value;
      numberElements++;
    }
    
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
   int tempArray []= new int [data.length +5];
      for(int i=0; i<data.length; i++){
        tempArray[i]=data[i];
        //creating a temp array to copy over the data from original
      }
      data = tempArray;
       }
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  //}//end grow()

}//end class