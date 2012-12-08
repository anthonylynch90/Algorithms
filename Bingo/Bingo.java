//********************************************************************
//  Bingo.java       
//
//  Demonstrates the use of a set collection.
//********************************************************************

import dataStructures.*;

public class Bingo
{
   //-----------------------------------------------------------------
   //  Creates all 75 bingo balls and stores them in a set. Then
   //  pulls several balls from the set at random and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int NUM_BALLS = 75, NUM_PULLS = 10;
      ArraySet bingoSet = new ArraySet();
      BingoBall ball;
      
      System.out.println("A set of 75 Bingo balls will now be created...\n\n");
     

      //create set of 75 bingo balls
      for (int num = 1; num <= NUM_BALLS; num++)
      {
         ball = new BingoBall (num);
         bingoSet.add (ball);
         System.out.println("Ball " + ball.toString()+ " has been inserted into the set ");
      }//end for

      System.out.println ("Size: " + bingoSet.size());
      System.out.println ();
      System.out.println("Now 10 bingo balls will be randomly selected and displayed ...\n");

      for (int num = 1; num <= NUM_PULLS; num++)
      {
         ball = (BingoBall) bingoSet.removeRandom();
         System.out.println (ball.toString());
      }
   }
}
