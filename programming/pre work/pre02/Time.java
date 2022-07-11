import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[]args){
  int hour = 16;
  int minute = 20;
  int second = 30;
  System.out.print("Number of seconds since midnight:  ");
  System.out.println((hour * 60 * 60) + (minute * 60) + second );
  int currTime = ((hour * 60 * 60) + (minute * 60) + second );
  int dayTotalSec = (24 * 60 * 60);
  System.out.print("Seconds remaining in the day:  ");
  System.out.println(dayTotalSec - currTime);
  double percentage =  (58830.0 / 86400.0) * 100; 
  System.out.printf("Percentage of the day that has passed:  " + "%.1f",percentage); 
  System.out.println("%");
  hour = 17;
  minute = 25;
  second = 20;
  int sHour = 16;
  int sMin = 20;
  int sSec = 30;
  hour = hour - sHour;
  minute = minute - sMin;
  second = second + sSec;
  System.out.print("Time elapsed since working on this program:  ");
  System.out.print(hour);
  System.out.print(" hour ");
  System.out.print(minute);
  System.out.print(" minutes ");
  System.out.print("and ");
  System.out.print(second);
  System.out.println(" seconds");

  }
}