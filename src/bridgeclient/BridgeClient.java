/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeclient;

/**
 *
 * @author brian
 */
import java.util.Scanner;
import java.io.*;

public class BridgeClient 
{
  public static void main(String[] args) 
  {
    
    try
    {
      Scanner sc = new Scanner(new File("hands.txt")); //create Scanner to read from txt
      
      while(sc.hasNext())  //for each line in txt file
      {
        String hand = sc.nextLine();
        System.out.println("Analyzing hand: " + hand);
        bridge bridge = new bridge(hand);     //create bridge object
        bridge.printHand();                   //print hand method
        bridge.printTotalPoints();            //print points method
        System.out.println();
      }
    }
    catch (FileNotFoundException fnfe)
    {
      System.out.println("Unable to find \"hands.txt\" file; exiting");
    }
    catch (Exception e)
    {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
