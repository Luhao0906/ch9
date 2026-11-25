public class Fraction{
	
	//instance variables (attributes, fields)
	private int numerator, denominator;
	
	//constructors
	public Fraction (){ //default
		numerator = 1;
		denominator = 2;
		
	}
	
	public Fraction (int n, int d){ //parameter
		numerator = n;
		setDenom(d);
		
	}
	
	public Fraction (String a){	//String
		int index = a.indexOf("/");
		String num1 = a.substring(0,index);
		String num2 = a.substring(index+1);
		numerator = Integer.parseInt(num1);
		setDenom(Integer.parseInt(num2));
		
		
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
	
	public void reduce() {
		int gcf = GCF(numerator, denominator);
		numerator = numerator / gcf;
		denominator = denominator / gcf;
	}
	
	//mult
	public static Fraction mult (Fraction a, Fraction b){ 
		int n = a.getNum() * b.getNum() ;
		int d = a.getDenom() * b.getDenom() ;
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;
			
	}
	
	//add
	public static Fraction add (Fraction a, Fraction b){ 
		int n = a.getNum() * b.getDenom() + a.getDenom() * b.getNum();
		int d = a.getDenom() * b.getDenom();
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;
			
	}
	
	//minus
	public static Fraction minus (Fraction a, Fraction b){ 
		int n = a.getNum() * b.getDenom() - a.getDenom() * b.getNum();
		int d = a.getDenom() * b.getDenom();
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;
			
	}
	
	//divide
	public static Fraction divide (Fraction a, Fraction b){ 
		int n = a.getNum() * b.getDenom();
		int d = a.getDenom() * b.getNum();
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;	
	}
	
	//find GCF
	public int GCF (int n, int d){
		n = Math.abs(n);
		d = Math.abs(d);
		int gcf=n;
		while(n != d){
			System.out.println(n + " " + d);
			if (n>d){
				n=n-d;
				gcf=n;
			}
			else if (d>n) {
				d=d-n;
				gcf=d;
				
			}
		}
		return gcf;
		}
	
}
