//Designer: Ethan Ding; Implementer: Chamin Lim; 10/15/2018
public class LemonadeStand {
	private int lemons;
	private int money;
	private int price;
	
	public LemonadeStand(){ //default constructor
		lemons = 10;
		money = 45;
		price = 1;
	}
	public void sellLemonade(){ //sells a lemonade which reduces lemons by 1 and gains money by current price.
		money += price;
		lemons -= 1;
	}
	public void buyLemons(){ //buys a lemon which reduces money by 2 and gains lemon by 3.
		money -= 2;
		lemons += 3;
	}
	public void upgrade(){ //upgrades a lemonade stand which reduces money by 4 and increases price by 1.	
		money -= 4;
		price += 1;
	}
	//Accessor methods: getMoney and getPrice
	public int getMoney() {
		return money;
	}
	public int getPrice() {
		return price;
	}
	//toString method to return the summary.
	public String toString(){
		return "You have " + lemons + " lemons, $" + money + " of total, and price for your lemonade is $" + price + " each.";
	}
}