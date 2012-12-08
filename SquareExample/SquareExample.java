///////////////////////////////////////////
//
// This is a class which generates a random number 
// between 0 and 10 and calculates and displays the 
// square of that number.
//
// Author : C Higgins
///////////////////////////////////////////////////

import java.util.Random;;


public class SquareExample {
  //private attribute
	int squareAnswer;
	
//constructor
	public SquareExample() {
		Random generator = new Random();
		int number = generator.nextInt(10);
		
		squareAnswer = getSquare(number);
		System.out.println("The square of " + number + " = " + squareAnswer);
	}//end constructor
	
	public int getSquare (int num) {
		int answer;
		answer = num * num;
		return answer;
	}//end square
	
	public static void main(String[] args) {
			new SquareExample();

	}//end main

}//end class
