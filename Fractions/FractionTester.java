public class FractionTester {

	public static void main(String[] args) {
		Fractions first = new Fractions(1, 4);
		Fractions second = new Fractions(2, 5);
		
		System.out.println("The numerator of first fraction is " + first.getNumerator());
		System.out.println("The denominator of first fraction is " + first.getDenominator());
		System.out.println("The numerator of second fraction is " + second.getNumerator());
		System.out.println("The denominator of second fraction is " + second.getDenominator());
		System.out.println("-----------------------------------------");
		System.out.println("If you add first and second fractions, you get " + (first.add(second)).toString());
		System.out.println("If you subtract first to second fractions, you get " + (first.subtract(second)).toString());
		System.out.println("If you multiply first and second fractions, you get " + (first.multiple(second)).toString());
		System.out.println("If you divide first to second fractions, you get " + (first.divide(second)).toString());
	}

}
