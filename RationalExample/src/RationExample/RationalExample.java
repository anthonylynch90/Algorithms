package RationExample;


public class RationalExample
{
    
    private Rational rational1, rational2, addAnswer, multiplyAnswer;
    
    public RationalExample (int num1, int den1, int num2, int den2){
    	// These are the two rational numbers
        rational1 = new Rational(num1, den1);
        rational2 = new Rational (num2, den2);
        
        // these are the two rational numbers that will contain
        // the answers. Both answers are initally initialised to 1/1
        addAnswer = new Rational(1, 1);
        multiplyAnswer = new Rational (1,1);
        
        // Now call the methods to add rationals, multiply rationals and check for equality
       addRationals();
       multiplyRationals();
        if (checkEquality())
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");
    }
    
    public void addRationals ()
    {
    	int newNumerator = 0;
        int newDenominator = 0;
       	
           //calculate the numerator section of the answer and store
           // this answer in the numerator section of the multipluAnswer rational
        newNumerator = rational2.getNumerator() * rational2.getNumerator();
        addAnswer.updateNumerator (newNumerator);
           
        newDenominator = rational1.getNumerator() * rational2.getDenominator() + rational1.getDenominator() * rational2.getNumerator();
        addAnswer.updateDenominator (newDenominator);

        
    	 System.out.println("");
    	System.out.println("The two rationals will now be added together");
    	System.out.print("Add Answer : " + rational1.getNumerator() + "/" + rational1.getDenominator() + " + " + rational2.getNumerator() + "/" + rational2.getDenominator());
        System.out.println(" = " + addAnswer.getNumerator() + "/" + addAnswer.getDenominator());
   
    }
  
    public boolean checkEquality()
    {
        boolean result = false;
        
        System.out.println("");
        System.out.println("The two rationals will now be checked for equality");
        
        // Add code here to check to see if two rationals are equal
        // and update the value of results accordingly
        
        return result;
            
            
    }
    
    
    public void multiplyRationals ()
    {
        int newNumerator = 0;
        int newDenominator = 0;
        
        System.out.println("");
    	System.out.println("The two rationals will now be multiplied together");
    	
        //calculate the numerator section of the answer and store
        // this answer in the numerator section of the multipluAnswer rational
        newNumerator = rational1.getNumerator() * rational2.getNumerator();
        multiplyAnswer.updateNumerator (newNumerator);
        
        // calculate the denominator section of the answer and store
        // this answer in the denominator section of the answer
        newDenominator= rational1.getDenominator() * rational2.getDenominator();
        multiplyAnswer.updateDenominator (newDenominator);
        
        // Now display on the console this answer
        System.out.print("Multiply Answer : " + rational1.getNumerator() + "/" + rational1.getDenominator() + " * " + rational2.getNumerator() + "/" + rational2.getDenominator());
        System.out.println(" = " + multiplyAnswer.getNumerator() + "/" + multiplyAnswer.getDenominator());
    }
    
    
    public static void main (String[] args)
    {
     RationalExample runRational = new RationalExample(1, 4, 1, 2);
       System.out.println("Rationals are 1/4 and 1/2 ");
      
    }
}


