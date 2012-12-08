//Book.java
//Class which defines the contents and behaviour of a book 
//C. Higgins

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book() {
		title = "";
		author = "";
		year = 0;
	}
	
	public Book (String t, String a, int y) {
		title = t;
		author = a;
		year = y;
	}
	
	public void setTitle (String t) {
		title = t;
	}
	
	public void setAuthor (String a) {
		author = a;
	}
	
	public void setYear (int y) {
		year = y;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() { 
		return "The book " + getTitle() + " was written by " + getAuthor() + " in " + getYear();		
	}
}
