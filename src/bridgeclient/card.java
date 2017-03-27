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

public abstract class card   //abstract class represents each card individually
{
  
  private final char face;    //face of card: 2,3,4....,Q,K,A
  
  public card(char newFace)   //Constructor method
  {
    this.face = newFace;
  }
  
  
  public char getFace ()      //Accesor Method
  {
    return this.face;
  }
  
  
  
  public String toString()   //toString Method
  {
    return "" + this.face;
  }
  
  
  public abstract int getPoints();  //calculates the value of card
 
  
}
