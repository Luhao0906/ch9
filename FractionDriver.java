public class FractionDriver{
	public static void main (String[] args){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(4, 6);
		Fraction f3 = new Fraction("33550336/33550336");
		Fraction f4 = new Fraction(f3);
		Fraction f5 = Fraction.mult(f1, f2);
		Fraction f6 = Fraction.divide(f1, f2);
		Fraction f7 = Fraction.add(f1, f2);
		Fraction f8 = Fraction.minus(f1, f2);
		System.out.println (f1);
		System.out.println (f2);
		System.out.println (f3);
		System.out.println (f4);
		System.out.println (f5);
		System.out.println (f6);
		System.out.println (f7);
		System.out.println (f8);			
		
	}

}
