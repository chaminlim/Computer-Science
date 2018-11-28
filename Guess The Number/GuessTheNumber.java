
//Chamin Lim; 11/16/18; Period 1
import java.util.Scanner;
public class GuessTheNumber {
	private static boolean turn;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Welcome message for user and deciding their name.
		System.out.println("Welcome to the Game of Nim!");
		System.out.println("Please enter your name.");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");

		// Deciding who goes first - computer and user.
		System.out.println("We will decide who is going first.");
		System.out.println("...");
		try { // Loading to make the game more natural.
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int order = (int) (Math.random() * 2);
		switch (order) {
		case 0:
			System.out.println("Looks like, Computer is going first!");
			turn = true;
			break;
		case 1:
			System.out.println("Looks like, " + name + " is going first!");
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
			System.out.println("Is the number " + num + "?");
			String reply = scanner.next();
			while (!(reply.equals("correct")) && (reply.equals("high") || reply.equals("low"))) {
				if(reply.equals("correct")) {
					System.out.println("Yay, I got it right! My attempt was " + count + ".");
				}
				if(reply.equals("high")) {
					num = (int)(Math.random()*(num-1)+1);
					count++;
				}
			}
		}
	}
}
