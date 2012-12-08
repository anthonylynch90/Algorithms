import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
	public static void main(String[] args) {
		try {
			String name1, name2; //Names
			int age1, age2; //ages
			
			//This defines the buffer that will hold the data to be input
			BufferedReader theDataStream;
			theDataStream = new BufferedReader(new InputStreamReader(System.in));
			
			//Read in the two names
			System.out.print("Enter the two names (hit the return key after entering each name): ");
			name1=theDataStream.readLine();
			name2=theDataStream.readLine();
			
			//Read in the two numbers
			System.out.print("Enter the two ages " +
			 "(hit the return key after entering each name): ");
			age1=Integer.parseInt(theDataStream.readLine());
			age2=Integer.parseInt(theDataStream.readLine());
			
			//Display the names and numbers
			System.out.println("The first person is called " + name1 + " and their age is " + age1);
			System.out.println("The second person is called " + name2 + " and their age is " + age2);
		} //end try
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}//end catch
	} //end main
} //end InputOutput
