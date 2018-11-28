import java.util.Scanner;

public class GCD {
	private static int first, second, max, min, remainder;

	public static void main(String[] args) {
		System.out.println("Let me find the GCD for you.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		first = scanner.nextInt();
		System.out.println("Please enter second number: ");
		second = scanner.nextInt();
		if (first >= second) {
			max = first;
			min = second;
		}
		if (second > first) {
			max = second;
			min = first;
		}
		while ((max % min) != 0) {
			remainder = max % min;
			System.out.println("The remainder between " + max + " and " + min + ": " + remainder);
			max = min;
			min = remainder;
		}
		System.out.println("The remainder between " + max + " and " + min + ": " + max % min);
		System.out.println("The GCD of " + first + " and " + second + " is " + remainder);
	}

}
