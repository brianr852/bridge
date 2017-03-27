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
import java.util.*;
import java.io.*;

public class suit
{
  private ArrayList<card> cards;       //instant variable
  private String suitStr;              //instant variable
  private final int MIN_LONG = 5;
  private final int VOID_POINTS = 3;
  private final int SINGLETON_POINTS = 2;
  private final int DOUBLETON_POINTS = 1;
  
  public suit (String newSuitStr)           //constructor method
  {
    this.cards = new ArrayList<card>();
    this.suitStr = newSuitStr;
    
    
  }
  
  
  public void addCard(char newCard)   //add method 
  {
    if ( newCard < 'A' )          // adds to card list deppending on number or figure
      this.cards.add( new cardWithNumber(newCard));
    else
      this.cards.add( new cardWithFigure(newCard));
  }
  
  
  public void printSuit()     //displays all the cards in the suit
  {
    if ( this.cards.size() > 0)
    {
      System.out.print( this.suitStr + ": \t");
      for ( card tempCard : this.cards )
      {
        System.out.print( tempCard.toString() + " " );
      }
      System.out.println();
  }
  }
  
  public int suitPoints() //calculates the total points for the given hand
                          
  {
    int total = 0;
    
    switch( this.cards.size())
    {
      case 0:
        total += this.VOID_POINTS;
        break;
      case 1:
        total += this.SINGLETON_POINTS;
        break;
      case 2:
        total += this.DOUBLETON_POINTS;
        break;
      default :
        break;
  }
    if (this.cards.size() > this.MIN_LONG )     
    {
      total += this.cards.size() - this.MIN_LONG;
    }
    
    for( card hand : this.cards )
    {
      total += hand.getPoints();
    }
    
    return total;
  }
}
