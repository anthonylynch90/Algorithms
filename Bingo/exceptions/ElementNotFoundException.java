//********************************************************************
//  ElementNotFoundException.java     
//
//  Represents the situation in which a target element is not
//  present in a collection
//********************************************************************

package exceptions;

public class ElementNotFoundException extends RuntimeException
{
   //-----------------------------------------------------------------
   //  Sets up this exception with an appropriate message.
   //-----------------------------------------------------------------
   public ElementNotFoundException (String collection)
   {
      super ("The target element is not in this " + collection);
   }
}
