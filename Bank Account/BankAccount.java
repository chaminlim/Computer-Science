//Chamin Lim; 10/04/2018; Period 1
public class BankAccount {
	private String name;
	private int balance;

	public BankAccount(String n, int b) {
		name = n;
		balance = b;
	}

	// Access Methods; getName and getBalance
	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int add) {
		balance += add;
	}

	public void withdrawal(int subtract) {
		balance -= subtract;
	}

	public String toString() {
		return "Your name is " + name + ", and your balance is $" + balance + ".";
	}
}
