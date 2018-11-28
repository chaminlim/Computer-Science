//Implementer: Chamin Lim & Tony Jiang; Designer: Cahir G. & Eric 
import java.util.Scanner;
public class Farm {
	private static int month = 12;
	private static int count = 3;
	private static int acre;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many acre do you want your farm to have: ");
		acre = scanner.nextInt();
		System.out.println("What type of plant do you want your farm to have?");
		System.out.println("Choose between potato and wheat.");
		String type = scanner.next();
		if (type.equals("potato")) {
			Potato potato = new Potato();
			while (month > 0) {
				System.out.println("You have " + month + " months left.");
				System.out.println("What would you like to do? Fertilize or Water?");
				String action = scanner.next();
				if (action.equals("water")) {
					potato.water();
					System.out.println("Your farm's status is " + potato.toString());
					month--;
				}
				if (count <= 0) {
					System.out.println("You no longer can fertilize.");
				}
				else if (action.equals("fertilize") && count > 0) {
					potato.fertilize();
					System.out.println("Your farm's status is " + potato.toString());
					count--;
					month--;
				}
			}
			System.out.println("12 months have passed, it is time to harvest.");
			potato.harvest();
			System.out.println("You have harvested " + potato.getYield()*acre + " potatoes.");
		}
		if (type.equals("wheat")) {
			Wheat wheat = new Wheat();
			while (month > 0) {
				System.out.println("You have " + month + " months left.");
				System.out.println("What would you like to do? Fertilize or Water?");
				String action = scanner.next();
				if (action.equals("water")) {
					wheat.water();
					System.out.println("Your farm's status is " + wheat.toString());
					month--;
				}
				if (count <= 0) {
					System.out.println("You no longer can fertilize.");
				}
				else if (action.equals("fertilize") && count > 0) {
					wheat.fertilize();
					System.out.println("Your farm's status is " + wheat.toString());
					count--;
					month--;
				}
			}
			System.out.println("12 months have passed, it is time to harvest.");
			wheat.harvest();
			System.out.println("You have harvested " + wheat.getYield()*acre + " wheats.");
		}

	}
}
