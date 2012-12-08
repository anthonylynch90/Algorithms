//********************************************************************
//  SetADT.java       
//
//  Defines the interface to a set collection.
//********************************************************************

package dataStructures; //name of folder that contains this interface

import java.util.Iterator;

public interface SetADT
{
   //  Adds one element to this set, ignoring duplicates
   public void add (Object element);

   //  Removes and returns a random element from this set
   public Object removeRandom ();

   //  Removes and returns the specified element from this set
   public Object remove (Object element);

   //  Returns the union of this set and the parameter
   public SetADT union (SetADT set);

   //  Returns true if this set contains the parameter
   public boolean contains (Object target);

   //  Returns true if this set and the parameter contain exactly
   //  the same elements
   public boolean equals (SetADT set);

   //  Returns true if this set contains no elements
   public boolean isEmpty();

   //  Returns the number of elements in this set
   public int size();

   //  Returns an iterator for the elements in this set
   public Iterator iterator();

   //  Returns a string representation of this set
   public String toString();
}
