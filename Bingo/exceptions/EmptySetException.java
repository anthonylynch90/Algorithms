//********************************************************************
//  EmptySetException.java     
//
//  Represents the situation in which a set is empty.
//********************************************************************

package exceptions;

public class EmptySetException extends RuntimeException
{
   //-----------------------------------------------------------------
   //  Creates the exception.
   //-----------------------------------------------------------------
   public EmptySetException()
   {
      super ("The set is empty.");
   }

   //-----------------------------------------------------------------
   //  Creates the exceptio with the specified message.
   //-----------------------------------------------------------------
   public EmptySetException (String message)
   {
      super (message);
   }
}
