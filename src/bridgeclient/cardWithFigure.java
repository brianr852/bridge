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

public class cardWithFigure extends card
{
  private final String MAPPING = "TJQKA";
  
  
  public cardWithFigure (char figure)  //constructor method
  {
    super(figure);
   
  }
  
  public int getPoints()
    
  {
    return MAPPING.indexOf( getFace()); // uses MAPPING to calculate points
  }
  
  
  
}
