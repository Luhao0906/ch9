public class Fraction{
	
	//instance variables (attributes, fields)
	private int numerator, denominator;
	
	//constructors
	public Fraction (){ //default
		numerator = 1;
		denominator = 1;
		
	}
	
	public Fraction (int n, int d){ //parameter
		numerator = n;
		denominator = setDenom(d);
		
	}
	
	public Fraction (String a){	//String
		int index = a.indexOf("/");
		String num1 = a.substring(0,index);
		String num2 = a.substring(index+1);
		numerator = Integer.parseInt(num1);
		denominator = setDenom(Integer.parseInt(num2));
		
		
	}
	
	public Fraction (Fraction f){	//copy
		numerator = f.numerator;
		denominator = f.denominator;
		
		
	}
	
	
	
	
	//behaviour method (accessor, mutator,helper)
	public int getNum(){
		return numerator;
	}
	public int getDenom(){
		return denominator;
	}
	
	public String toString(){
		return numerator + "/" + denominator;
		
	}
	
	
	
	//mutator method
	public void setNum(int n){
		numerator =n;
	}
	public void setDenom(int d){
		denominator =d;
		if (d!=0)	denominator = d;
		else{    	
			denominator=1;
			System.out.println("denominator cannot be 0");
		}
	}
	
	
}
