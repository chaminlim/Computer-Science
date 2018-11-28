
//Chamin Lim; 9/27/18; Period 1
import java.util.Scanner;

public class GameOfNim {
	private static String level;
	private static int mode;
	private static boolean turn; // If turn is true, it is computer's turn and if turn is false, it is user's
									// turn.
	private static int userPick, compPick;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
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

		// Deciding which level, stupid(0) or smart(1)
		System.out.println("Select the level: stupid/smart.");
		level = scanner.next();
		while (!(level.equalsIgnoreCase("stupid") || level.equalsIgnoreCase("smart"))) {
			System.out.println("You have entered wrong input. Please choose level between stupid and smart. ---");
			level = scanner.next();
		}
		if (level.equalsIgnoreCase("stupid") || level.equalsIgnoreCase("smart")) {
			if (level.equalsIgnoreCase("stupid"))
				mode = 0;
			if (level.equalsIgnoreCase("smart"))
				mode = 1;
		}

		// Game Algorithms
		int pile = (int) (Math.random() * 91 + 10);
		if (mode == 0) { // Stupid level
			System.out.println("You have selected \"stupid\" level.");
			while (pile >= 1) {
				System.out.println("There is " + pile + " marbles in the pile(s), think wise!");
				System.out.println("...");
				try { // Loading to make the game more natural.
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (turn == false) { // User starts first if turn is false at the start.
					System.out.println("It is your turn.");
					System.out.println("You must take at least 1 marble but at most half of marbles.");
					userPick = scanner.nextInt();
					while (userPick < 1 || userPick > pile / 2) { // Error message when user picked wrong input.
						System.out.println("It cannot be less than 1 and greater than half of piles. Pick again...");
						userPick = scanner.nextInt();
					}
					pile = pile - userPick;
					turn = true;
				} else if (turn == true) { // Computer starts first if turn is true at the start.
					System.out.println("It is computer's turn.");
					System.out.println("...");
					try { // Loading to make the game more natural.
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					compPick = (int) (Math.random() * (pile / 2) + 1); // Computer picks between legal value of 1 and
																		// half of pile.
					System.out.println("Computer picked " + compPick + " marble(s).");
					pile = pile - compPick;
					turn = false;
				}
				if (pile == 1) { // Show who had won when pile is 1 left
					System.out.println("There is only one marble left!");
					if (turn == false)
						System.out.println(name + " have lost... Better luck next time!");
					if (turn == true)
						System.out.println(name + " won!! Congratulations!");
					break;
				}
			}
		}
		if (mode == 1) { // Smart level
			System.out.println("You have selected \"smart\" level.");
			while (pile >= 1) {
				System.out.println("There is " + pile + " marbles in the pile(s), think wise!");
				System.out.println("...");
				try { // Loading to make the game more natural.
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (turn == false) { // User starts first if turn is false at the start.
					System.out.println("It is your turn.");
					System.out.println("You must take at least 1 marble but at most half of marbles.");
					userPick = scanner.nextInt();
					while (userPick < 1 || userPick > pile / 2) { // Error message when user picked wrong input.
						System.out.println("It cannot be less than 1 and greater than half of piles. Pick again...");
						userPick = scanner.nextInt();
					}
					pile = pile - userPick;
					turn = true;
				} else if (turn == true) { // Computer starts first if turn is true at the start.
					System.out.println("It is computer's turn.");
					System.out.println("...");
					try { // Loading to make the game more natural.
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					for(int x = 2; x <= 64; x *= 2){
						if(pile == x - 1){
							System.out.println("random");
							compPick = (int) (Math.random() * (pile / 2) + 1);
						}
					}
					if(pile >= 64 && pile <= 100){
						compPick = pile - 63;
					}
					if(pile >= 32 && pile <= 62){
						compPick = pile - 31;
					}
					if(pile >= 16 && pile <= 30){
						compPick = pile - 15;
					}
					if(pile >= 8 && pile <= 14){
						compPick = pile - 7;
					}
					if(pile >= 4 && pile <= 6){
						compPick = pile - 3;
					}
					if(pile == 2){
						compPick = pile - 1;
					}

					System.out.println("Computer picked " + compPick + " marble(s).");
					pile = pile - compPick;
					turn = false;
				}
				if (pile == 1) { // Show who had won when pile is 1 left
					System.out.println("There is only one marble left!");
					if (turn == false)
						System.out.println(name + " lost... Better luck next time!");
					if (turn == true)
						System.out.println(name + " won!! Congratulations!");
					break;
				}
			}
		}
	}
}
