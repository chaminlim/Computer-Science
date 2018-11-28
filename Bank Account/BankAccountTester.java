//Chamin Lim; 10/04/2018; Period 1
import java.util.Scanner;
public class BankAccountTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = scan.next();
		System.out.println("Please enter your current balance.");
		int balance = scan.nextInt();
		
		BankAccount account = new BankAccount(name, balance);
		System.out.println("Summary of your account: \n" + account.toString());
		
		System.out.println("Would you like to deposit or withdraw?");
		System.out.println("Enter deposit or withdraw or quit.");
		
		String exec = scan.next();
		while (!(exec.equalsIgnoreCase("deposit") || exec.equalsIgnoreCase("withdraw") || exec.equalsIgnoreCase("quit"))) {
			System.out.println("You have entered wrong input. Please choose deposit or withdraw or quit.");
			exec = scan.next();
		}
		while (exec.equalsIgnoreCase("deposit") || exec.equalsIgnoreCase("withdraw") || exec.equalsIgnoreCase("quit")) {
			if (exec.equalsIgnoreCase("deposit")) {
				System.out.println("You choose deposit, how much do you want to deposit?");
				int moneyDeposit = scan.nextInt();
				System.out.println("You deposited $" + moneyDeposit + ".");
				account.deposit(moneyDeposit);
				System.out.println("Now you have $" + account.getBalance());
				System.out.println("Would you like to keep deposit or withdraw?");
				System.out.println("Enter deposit or withdraw or quit.");
				exec = scan.next();
			}
			if (exec.equalsIgnoreCase("withdraw")) {
				System.out.println("You choose withdrawal, how much do you want to withdraw?");
				int moneyWithdraw = scan.nextInt();
				System.out.println("You deposited $" + moneyWithdraw + ".");
				account.withdrawal(moneyWithdraw);
				System.out.println("Now you have $" + account.getBalance());
				System.out.println("Would you like to keep deposit or withdraw?");
				System.out.println("Enter deposit or withdraw or quit.");
				exec = scan.next();
			}
			if (exec.equalsIgnoreCase("quit")) {
				System.out.println("Thanks for using our bank!");
				System.exit(0);
			}
			if(!(exec.equalsIgnoreCase("deposit") || exec.equalsIgnoreCase("withdraw") || exec.equalsIgnoreCase("quit"))){
				while (!(exec.equalsIgnoreCase("deposit") || exec.equalsIgnoreCase("withdraw") || exec.equalsIgnoreCase("quit"))) {
					System.out.println("You have entered wrong input. Please choose deposit or withdraw or quit.");
					exec = scan.next();
				}
			}
		}
	}
}
