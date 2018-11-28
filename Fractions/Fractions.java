//Chamin Lim; 10/17/18
public class Fractions {
	int num;
	int denom;
	public Fractions(int x, int y) {
		num = x;
		denom = y;
	}
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return denom;
	}
	public Fractions add(Fractions second) {
		int num2 = num * second.getDenominator() + second.getNumerator() * denom;
		int denom2 = denom * second.getDenominator();
		
		return new Fractions(num2, denom2);
	} 
	public Fractions subtract(Fractions second) {
		int num2 = num * second.getDenominator() - second.getNumerator() * denom;
		int denom2 = denom * second.getDenominator();
		
		return new Fractions(num2, denom2);
	}
	public Fractions multiple(Fractions second) {
		int num2 = num * second.getNumerator();
		int denom2 = denom * second.getDenominator();
		
		return new Fractions(num2, denom2);
	}
	public Fractions divide(Fractions second) {
		int num2 = num * second.getDenominator();
		int denom2 = denom * second.getNumerator();
		
		return new Fractions(num2, denom2);
	}
	public String toString() {
		return num + "/" + denom;
	}
}
