public class Fraction{
	
	//instance variables (attributes, fields)
	private int numerator, denominator;
	
	//constructors
	public Fraction (){
		numerator = 1;
		denominator = 1;
		
	}
	
	public Fraction (int n, int d){
		numerator = n;
		denominator = d;
		
	}
	
	//behaviour method (accessor, mutator,helper)
	public int getNum(){
		return numerator;
	}
	public int getDenom(){
		return denominator;
	}
	
	
	
}
