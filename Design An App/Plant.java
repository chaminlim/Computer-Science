//Implementer: Chamin Lim & Tony Jiang; Designer: Cahir G. & Eric 
public class Plant {
	private int yield, growth, failure;
	public Plant(int y, int g, int f){
		yield = y;
		growth = g;
		failure = f;
	}
	//Modifier methods: fertilize, water, and harvest
	public void fertilize() { //increases yield by 1 but only can used 3 times
		yield++;
	}
	public void water() { //decreases growth time by 1 month
		growth--;
	}
	public int harvest() { //if the growth time = 0, return the yield - the failure chance, if growth time is not = to 0, return 0;
		if(growth < 0)
			return yield - failure;
		else
			return 0;
	}
	//Access methods: getYield, getGrowth, getFailure, and toString
	public int getYield() {
		return yield;
	}
	public int getGrowth() {
		return growth;
	}
	public int getFailure() {
		return failure;
	}
	public String toString() {
		return "Yield/acre: " + yield + "\nGrowth Time: " + growth + "\nFailure Chance: " + failure;
	}
	
}
