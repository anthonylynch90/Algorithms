package RationExample;


/*
 * Created on Sep 27, 2009
 *
 * Author : Catherine Higgins
 * 
 */
public class Rational {
	// Even though the formal definition of a rational is an 
	// array of two numbers, to keep it simple, a rational is defined here
	// as being two individual integers, a numerator and a denominator. 
    	
	private int numerator, denominator;
    	
    	public Rational (int num, int den)
    	{
    		numerator = num;
    		denominator = den;
    	}
    	
    	public int getNumerator()
    	{
    		return numerator;
    	}
    	
    	public int getDenominator()
    	{
    		return denominator;
    	}
    	
    	public void updateDenominator(int newValue)
    	{
    	    denominator = newValue;
    	}
    	
    	public void updateNumerator(int newValue)
    	{
    	    numerator = newValue;
    	}
    
} //end Rational


