package class022316;

public class Dog {

	private final double MIN_WEIGHT = 12;
	
	//Weight, Sets, and Gets
	private double weight;
	
	public void setWeight(double w){
		if (w >= MIN_WEIGHT){
			weight = w;
		}else{
			weight = 12;
		}
	}
	public double getWeight(){
		return weight;
	}
	//End Weight, Sets, and Gets
	
	//Constructors
	//Basic Constructor
	public Dog(){
		weight = 15;
	}
	//Constructor with Weight Parameter
	public Dog(double w){
		setWeight(w);
	}
	
	public String toString(){
		return "Weight = " + weight;
	}
}
