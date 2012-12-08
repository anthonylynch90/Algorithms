// Bookshelf.java
// Class which stores 3 books in an array and displays their contents
// C. Higgins

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookShelf {

	// private data
	private Book[] arrayBook;
	private int capacity = 3;

	// constructor - create an empty array
	public BookShelf() {
		    arrayBook = new Book[capacity]; 
	}
	
	public void addABook (int i) {
	  try {	
	    Book aBook = new Book();  
		String title, author;
		int year;
		
		if (i < capacity) {
			BufferedReader theDataStream;
			theDataStream = new BufferedReader(new InputStreamReader(System.in));
			
			//Input the title, author and year
			System.out.println("Enter the title, author and the year: ");
			title = theDataStream.readLine();
			author = theDataStream.readLine();
			year = Integer.parseInt(theDataStream.readLine());
	
			// Store these details in aBook
			aBook.setTitle(title);
			aBook.setAuthor(author);
			aBook.setYear(year);
			
			// store aBook in the array
		    arrayBook[i] = aBook;
		} //end if 
		else
			    System.out.println("cannot add as there are already " + capacity + " books in the array");
	  } //end try
	  
	  catch (IOException e) {
		  System.out.println(e.getMessage());
	  }
			
	}//end addABook
	
	public void displayBooks() {
		for (int i=0; i<capacity; i++)
			System.out.println(arrayBook[i].toString());
	}
	 
	public static void main(String[] args) {
		
		BookShelf b = new BookShelf();	
		for (int i=0; i< b.capacity; i++) 
			b.addABook(i);
		System.out.println("");
		System.out.println("The books are: ");
		b.displayBooks();
		
		}

}
