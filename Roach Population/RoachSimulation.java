import java.util.Scanner;

public class RoachSimulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the initial population of roaches.");
		int pop = scanner.nextInt();
		RoachPopulation roaches = new RoachPopulation(pop);
		System.out.println("Will you breed or spray or quit the RoachSimulation?");
		System.out.println("Please enter breed/spray/quit.");

		String exec = scanner.next();
		while (!(exec.equalsIgnoreCase("breed") || exec.equalsIgnoreCase("spray") || exec.equalsIgnoreCase("quit"))) {
			System.out.println("You have entered wrong input. Please choose breed or spray or quit.");
			exec = scanner.next();
		}
		while (exec.equalsIgnoreCase("breed") || exec.equalsIgnoreCase("spray") || exec.equalsIgnoreCase("quit")) {
			if (exec.equalsIgnoreCase("breed")) {
				roaches.breed();
				System.out.println("The population of roaches is " + roaches.getRoaches());
				System.out.println("Will you breed or spray or quit the RoachSimulation?");
				System.out.println("Please enter breed/spray/quit.");
				exec = scanner.next();
			}
			if (exec.equalsIgnoreCase("spray")) {
				roaches.spray();
				System.out.println("The population of roaches is " + roaches.getRoaches());
				System.out.println("Will you breed or spray or quit the RoachSimulation?");
				System.out.println("Please enter breed/spray/quit.");
				exec = scanner.next();
			}
			if (exec.equalsIgnoreCase("quit")) {
				System.exit(0);
			}
			if(!(exec.equalsIgnoreCase("breed") || exec.equalsIgnoreCase("spray") || exec.equalsIgnoreCase("quit"))){
				while (!(exec.equalsIgnoreCase("breed") || exec.equalsIgnoreCase("spray") || exec.equalsIgnoreCase("quit"))) {
					System.out.println("You have entered wrong input. Please choose breed or spray or quit.");
					exec = scanner.next();
				}
			}
		}		
	}
}
