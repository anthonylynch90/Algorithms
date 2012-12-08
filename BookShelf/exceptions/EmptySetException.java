//********************************************************************
//  EmptySetException.java     
//
//  Represents the situation in which a set is empty.
//********************************************************************

package exceptions;

public class EmptySetException extends RuntimeException
{
   //-----------------------------------------------------------------
   //-----------------------------------------------------------------
   public EmptySetException()
   {
      super ("The set is empty.");
   }

   //-----------------------------------------------------------------
   //-----------------------------------------------------------------
   public EmptySetException (String message)
   {
      super (message);
   }
}
