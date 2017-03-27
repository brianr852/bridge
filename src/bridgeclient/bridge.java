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

public class bridge
{
  
  private final String [] SUIT_STRINGS = {"Clubs", "Diamonds", "Hearts", "Spades"};
  private final String SUIT_CHARS = "CDHS";
  private final suit [] hand;
  
  public bridge(String newHand)   //constructor method
  {
    this.hand = new suit[ this.SUIT_CHARS.length() ];  //instantiates the instance varable
    
    for(int i = 0; i < this.hand.length; i++)
    {
      this.hand[i] = new suit( this.SUIT_STRINGS[i]);
    }
    
    Scanner parse = new Scanner(newHand);          //takes the input line
    parse.useDelimiter(" ");                       //fills with appropriate data
    
    while(parse.hasNext())
    {
      String tempCard = parse.next();
      
      char tempFace = tempCard.charAt(0);
      char tempSuit = tempCard.charAt(1);
      
      this.hand[ this.SUIT_CHARS.indexOf( tempSuit) ].addCard(tempFace);
    }
    
    
    
  }
  
  public void printHand()            //prints all four suits
  {
    for (int i = 0; i < this.hand.length; i++)
    {
      this.hand[i].printSuit();
    }
  
    
    
    
  }
  
  
  public void printTotalPoints()    //calculates total points for the given hand
  {
    int total = 0;
    for (int i = 0;i < this.hand.length;i++)
    {
      total += this.hand[i].suitPoints();
    }
    System.out.println( "Total points: " + total);
    
    
    
    
    
  }
  
}