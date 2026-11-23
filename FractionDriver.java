public class FractionDriver{
public static void main (String[] args){
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction(1001, 11);
	Fraction f3 = new Fraction("33550336/33550336");
	Fraction f4 = new Fraction(f3);
	Fraction f5 = Fraction.mult(f1, f2);
	System.out.println (f1);
	System.out.println (f2);
	System.out.println (f3);
	System.out.println (f4);
	System.out.println (f5);	
	System.out.println (Fraction.GCF(f2));
		
	}

}
