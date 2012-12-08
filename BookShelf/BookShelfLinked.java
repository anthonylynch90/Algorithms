import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.*;

//import BookNode;
import exceptions.*;

public class BookShelfLinked {

	private BookNode list, last;
	int capacity = 3;
	int count = 0;

	public BookShelfLinked() {
		 list = last = null;
		 count = 0;
		 for (int i=0; i< 3; i++) 
	        addABook(i);
	     System.out.println("");
	     System.out.println("The books are: ");
	     displayBooks();   
	   }
	
	public void addABook (int i) {
	  try {	
	    Book aBook = new Book();  
	    
		String title, author;
		int year;
		if (i < capacity) {
			BufferedReader theDataStream;
			theDataStream = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the title and the author");
			title = theDataStream.readLine();
			author = theDataStream.readLine();
			year = Integer.parseInt(theDataStream.readLine());
			//System.out.println(arrayBook[0].toString());
			aBook.setTitle(title);
			aBook.setAuthor(author);
			aBook.setYear(year);
			
			BookNode aBookNode = new BookNode(aBook); 
			 if (!contains(aBook)) {
			     aBookNode.setNext(list);
			     count++;
			     list = aBookNode;
			     if (i == 0)  
			         last = aBookNode;
			 }
			 else
			     System.out.println("This book already exists and will not be added");
		
			    
		}//end if
	  } //end try
	  
	  catch (IOException e) {
		  System.out.println(e.getMessage());
	  } //end catch
			
	}//end addABook
	
//-----------------------------------------------------------------
//  Returns true if this set is empty and false otherwise. 
//-----------------------------------------------------------------
public boolean isEmpty()
{
   return (count == 0);
}


public Book remove ()
{
boolean found = false;
BookNode previous, current;
Book result = null;

if (isEmpty()) 
result = list.getElement();
list = list.getNext();
return result;
}


	public void displayBooks() {
	    Book aBook = new Book();
		for (int i=0; i<count; i++) {
		    aBook = remove();
			System.out.println(aBook.toString());
		}	
	}
	
	 public boolean contains (Book aBook)
	   {
	      boolean found = false;

	      BookNode current = list;

	      for (int look=0; look < count && !found; look++)
	         if (current.getElement().equals(aBook))
	            found = true;
	         else
		    current = current.getNext();

	      return found;
	   }
	 
	public static void main(String[] args) {
		
		    new BookShelfLinked();	
}

}//end BookShelfLinked
