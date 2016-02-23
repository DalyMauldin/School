package carlshorse;

public class horse {
	private boolean ageErr = false;
	private boolean weightErr = false;
	private String name;
	public void setName(String x) {
		name = x;
	}
	public String getName() {
		return name;
	}

	public boolean getAgeErr() {
		return ageErr;
	}
	public boolean getWeightErr() {
		return weightErr;
	}
	
	private int age;
	public void setAge(int x) {
		if(x > 0){
			age = x;
		} else {
			System.out.println(name + "'s Age cannot be less than 0 or a negative age.");
			ageErr = true;
		}
	}
	public int getAge() {
		return age;
	}
	private double weight;
	public void setWeight(double x) {
		if (x > 0.0) {
			weight = x;
		} else {
			System.out.println(name + "'s Weight cannot be less than 0 or a negative weight.");
			weightErr = true;
		}
	}
	public double getWeight() {
		return weight;
	}
}