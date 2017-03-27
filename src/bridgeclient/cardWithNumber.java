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

public class cardWithNumber extends card
{
  public cardWithNumber(char number) //constructor method
  {
    super(number);
  }
  
  
  public int getPoints()    //gets 0 points
  {
    return 0;
  }
  
}
