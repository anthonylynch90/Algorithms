//********************************************************************
//  LinkedSet.java       
//
//  Represents a linked implementation of a set which adds to the START
// and END of a list. 
//********************************************************************

package dataStructures;

import java.util.*;

import exceptions.EmptySetException;

public class LinkedSet implements SetADT
{
   private static Random rand = new Random();

   private int count;  // the current number of elements in the set
   private LinearNode list; //pointer to the first element added to the list

   private LinearNode last; //pointer to last element added to the list 

   //-----------------------------------------------------------------
   //  Creates an empty set.
   //-----------------------------------------------------------------
   public LinkedSet()
   {
      count = 0;
      last = null;  // this points to the last element in the set
      list = null; // this points to the first element in the set
   }

  //-----------------------------------------------------------------
   //  Adds the specified element to the start of the set if it's not already
   //  present.
   //-----------------------------------------------------------------
   
   public void add (Object element)
   {
      if (!(contains(element)))
      {
         LinearNode node = new LinearNode (element);
         node.setNext(list);
         list = node;
         if (size() == 0)  
             last = node;
         count++;
      }
   }

// -----------------------------------------------------------------
   //  Adds the specified element to the end of the set if it's not already
   //  present.  
   //-----------------------------------------------------------------
/*     
   public void add (Object element)    { 
       LinearNode node = new LinearNode (element);
   
       
        if (size() == 0) {  
          node.setNext(last);
          last = node;
          list = node;
          count++;
         }
        else 
          if (!(contains(element))){
            last.setNext(node);
            last = node;
            count++;   
          } //end if
          
   }//end add
  */
   
   
   //-----------------------------------------------------------------
   //  Adds the contents of the parameter to this set.
   //-----------------------------------------------------------------
   public void addAll (SetADT set)
   {
      Iterator scan = set.iterator();

      while (scan.hasNext())
         add (scan.next());
   }

   //-----------------------------------------------------------------
   //  Removes a random element from the set and returns it. Throws
   //  an EmptySetException if the set is empty.
   //-----------------------------------------------------------------
   public Object removeRandom() throws EmptySetException
   {
      LinearNode previous, current;
      Object result = null;

      if (isEmpty())
         throw new EmptySetException();

      int choice = rand.nextInt(count) + 1;

      if (choice == 1)
      {
         result = list.getElement();
         list = list.getNext();
      }
      else
      {
         previous = list;
         for (int skip=2; skip < choice; skip++)
            previous = previous.getNext();
         current = previous.getNext(); //the element to delete 
         result = current.getElement();
         previous.setNext(current.getNext()); //make the previous pointer,
                                              // "point around" the current node
      }
      
      count--;
 
      return result;
   }

   //-----------------------------------------------------------------
   //  Removes the specified element from the set and returns it.
   //  Throws an EmptySetException if the set is empty and a
   //  NoSuchElemetnException if the target is not in the set.
   //-----------------------------------------------------------------
   public Object remove (Object target) throws EmptySetException,
   												NoSuchElementException
 {
 boolean found = false;
 LinearNode previous, current;
  Object result = null;

if (isEmpty())
throw new EmptySetException();

if (list.getElement().equals(target))
{       //note that the "equals" above needs to be overwritten
// in whatever class is going to use this LinkedSet
result = list.getElement();
list = list.getNext();
}

else
{
   previous = list;
   current = list.getNext();
   for (int look=0; look < count - 1 && !found; look++)
      if (current.getElement().equals(target))
         found = true;
      else
      {
         previous = current;
         current = current.getNext();
      }

   if (!found) 
      throw new NoSuchElementException();
   
   result = current.getElement();
   previous.setNext(current.getNext());

   
count--;
}
return result;
}
      
   
   //-----------------------------------------------------------------
   //  Returns a new set that is the union of this set and the
   //  parameter.
   //-----------------------------------------------------------------
   public SetADT union (SetADT set)
   {
      LinkedSet both = new LinkedSet();

      LinearNode current = last;

      while (current != null)
      {
         both.add (current.getElement());
         current = current.getNext();
      }

      Iterator scan = set.iterator();
      while (scan.hasNext())
         both.add (scan.next());

      return both;
   }

   //-----------------------------------------------------------------
   //  Returns true if this set contains the specified target
   //  element.
   //-----------------------------------------------------------------
   public boolean contains (Object target)
   {
      boolean found = false;

      LinearNode current = list;

      for (int look=0; look < count && !found; look++)
         if (current.getElement().equals(target))
            found = true;
         else
	    current = current.getNext();

      return found;
   }

   //-----------------------------------------------------------------
   //  Returns true if this set contains exactly the same elements
   //  as the parameter.
   //-----------------------------------------------------------------
   public boolean equals (SetADT set)
   {
      boolean result = false;
      LinkedSet temp1 = new LinkedSet();
      LinkedSet temp2 = new LinkedSet();
      Object obj;

      if (size() == set.size())
      { 
         temp1.addAll(this);
         temp2.addAll(set);

         Iterator scan = set.iterator();

         while (scan.hasNext())
         {
            obj = scan.next();   
            if (temp1.contains(obj))
            {
               temp1.remove(obj);
               temp2.remove(obj);
            }
  
         }
         result = (temp1.isEmpty() && temp2.isEmpty());
      }

      return result;
   }

   //-----------------------------------------------------------------
   //  Returns true if this set is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
      return (size() == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements currently in this set.
   //-----------------------------------------------------------------
   public int size()
   {
      return count;
   }

   //-----------------------------------------------------------------
   //  Returns an iterator for the elements currently in this set.
   //-----------------------------------------------------------------
   public Iterator iterator()
   {
      return new LinkedIterator (list, count);
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this set. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      LinearNode current = list;

      while (current != null)
      {
         result += current.getElement().toString() + "\n";
         current = current.getNext();
      }

      return result;
   }
}
