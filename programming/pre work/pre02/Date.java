import java.io.*;
import java.util.*;

class Date {
  public static void main(String[] args){
    String day = "Saturday";
    int date = 8;
    String month = "January";
    int year = 2022;
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
  }