
public class RoachPopulation {
	private int population;
	public RoachPopulation(int x){
		population = x;
	}	
	public void breed(){
		population *= 2;
	}
	public void spray(){
		population = (int)(population * 0.9);
	}
	public int getRoaches(){		
		return population;
	}
}
