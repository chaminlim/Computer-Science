//Designer: Ethan Ding; Implementer: Chamin Lim; 10/15/2018
import java.util.Scanner;

public class LemonadeBusiness {
	public static void main(String[] args) {
		LemonadeStand stand = new LemonadeStand();
		Scanner scan = new Scanner(System.in); //scanner for user input: buy, sell, upgrade
		System.out.println("You have opened a new lemonade stand!");
		System.out.println("Your goal is to have $50 by selling lemonades.");
		System.out.println(stand.toString());
		System.out.println("Would you like to buy lemons or sell lemonade or upgrade your stand?");
		System.out.println("Select between buy/sell/upgrade.");
		
		String exec = scan.next(); //gets the user input
		while (stand.getMoney() < 50) { //game plays until the money reaches 50
			if (exec.equalsIgnoreCase("buy")) { //buy section
				stand.buyLemons();
				System.out.println("You have bought a lemon.");
				System.out.println(stand.toString());
				exec = scan.next(); //gets next input
			}
			else if (exec.equalsIgnoreCase("sell")) { //sell section
				stand.sellLemonade();
				System.out.println("You have sold a lemonade.");
				System.out.println(stand.toString());
				exec = scan.next(); //gets next input
			}
			else if (exec.equalsIgnoreCase("upgrade")) { //upgrade section
				stand.upgrade();
				System.out.println("You have upgraded your lemonade stand.");
				System.out.println(stand.toString());
				exec = scan.next(); //gets next input
			}
			//prevents user's wrong input
			while (!(exec.equalsIgnoreCase("buy") || exec.equalsIgnoreCase("sell") || exec.equalsIgnoreCase("upgrade"))) { 
				System.out.println("Type again..");
				exec = scan.next(); //gets next input
			}
		}
		//Congratulations message comes out when the money reaches 50
		System.out.println("Congratulations! You have successfully made yourself $" + stand.getMoney() + "!");
		System.exit(0);
	}
}
