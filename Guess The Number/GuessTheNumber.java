
//Chamin Lim; 11/16/18; Period 1
import java.util.Scanner;

public class GuessTheNumber {
	private static boolean turn;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Welcome message for user and deciding their name.
		System.out.println("Welcome to the Guess The Number!");

		// Deciding who goes first - computer and user.
		System.out.println("We will decide who will decide the number.");
		System.out.println("...");
		try { // Loading to make the game more natural.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int order = (int) (Math.random() * 2);
		switch (order) {
		case 0:
			System.out.println("Looks like, Computer is choosing the number!");
			turn = false;
			;
			break;
		case 1:
			System.out.println("Looks like, you are choosing the number.");
			turn = false;
			break;
		default:
			System.out.println("Oops.");
			break;
		}
		if (turn == true) {
			int random = (int) (Math.random() * 100 + 1); // random number that is between 1 and 100 inclusively.
			int count = 0;
			System.out.println("Please guess the number.");
			int num = scanner.nextInt();
			while (num != random) {
				if (num > random) {
					System.out.println("The number is too high.");
					count++;
					num = scanner.nextInt();
				}
				if (num < random) {
					System.out.println("The number is too low.");
					count++;
					num = scanner.nextInt();
				}
			}
			System.out.println("You got it right! The number of attempt was " + count + ".");
		}
		if (turn == false) {
			int num = (int) (Math.random() * 100 + 1);
			int count = 0;
			int upperBound = 100;
			int lowerBound = 1;
			System.out.println("Is the number " + num + "?");
			String reply = scanner.next();
			while (reply.equals("correct") || reply.equals("high") || reply.equals("low")) {
				if (reply.equals("correct")) {
					System.out.println("Yay, I got it right! My attempt was " + count + ".");
					break;
				}
				if (reply.equals("high")) {
					upperBound = num - 1;
					count++;
					num = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
					System.out.println("Is the number " + num + "?");
					reply = scanner.next();
				}
				if (reply.equals("low")) {
					lowerBound = num + 1;
					count++;
					num = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
					System.out.println("Is the number " + num + "?");
					reply = scanner.next();
				}
			}
		}
	}
}
