//****************************************************************
//  LinkedIterator.java       
//
//  Represents an iterator for a linked list of linear nodes.
//****************************************************************
    
package dataStructures;

import java.util.*;
    
public class LinkedIterator implements Iterator
{
   private LinearNode current;  // the current position
    
    //-------------------------------------------------------------
    //  Sets up this iterator using the specified items.
    //-------------------------------------------------------------
    public LinkedIterator (LinearNode collection, int size)
    {
       current = collection;
    }
 
    //-------------------------------------------------------------
    //  Returns true if this iterator has at least one more element
    //  to deliver in the iteraion.
    //-------------------------------------------------------------
    public boolean hasNext()
    {
       return (current!= null);
    }
 
    //-------------------------------------------------------------
    //  Returns the next element in the iteration. If there are no
    //  more elements in this itertion, a NoSuchElementException is
    //  thrown.
    //-------------------------------------------------------------
    public Object next()
    {
       if (! hasNext())
          throw new NoSuchElementException();
 
       Object result = current.getElement();
       current = current.getNext();
       return result;
    }
 
    //-------------------------------------------------------------
    //  The remove operation is not supported.
    //-------------------------------------------------------------
    public void remove() throws UnsupportedOperationException
    {
       throw new UnsupportedOperationException();
    }
}
