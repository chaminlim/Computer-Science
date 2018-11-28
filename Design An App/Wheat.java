//Implementer: Chamin Lim & Tony Jiang; Designer: Cahir G. & Eric 
public class Wheat extends Plant{
	private static int yieldP = 200;
	public Wheat() {
		super(yieldP, 4, 10);
	}
	public void fertilize() {
		yieldP += 2;
	}
}
