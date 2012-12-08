//********************************************************************
//  BingoBall.java       
//
//  Represents a ball used in a BINGO game.
//********************************************************************

public class BingoBall
{
   private char letter;
   private int number;

   //-----------------------------------------------------------------
   //  Sets up this BINGO ball wth the specified number and the
   //  appropriate letter.
   //-----------------------------------------------------------------
   public BingoBall (int num)
   {
      this.number = num;

      if (num <= 15)
         this.letter = 'B';
      else
         if (num <= 30)
           this.letter = 'I';
         else
            if (num <= 45)
               this.letter = 'N';
            else
               if (num <= 60)
                  this.letter = 'G';
               else
                  this.letter = 'O';
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this BINGO ball.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return (this.letter + " " + this.number);
   }
   
   public char getLetter()
   {
	   return letter;
   }
   
   public int getNum()
   {
	   return number;
   }
   
   public boolean equals(Object other)
   {
 	  boolean theResult;
 	  BingoBall myBall= (BingoBall) other;
 	  if(this.letter == myBall.getLetter() && this.number == myBall.getNum())
 		  theResult = true;
 	  else
 		  theResult = false;
 	  
 	  return theResult;
   }
}
