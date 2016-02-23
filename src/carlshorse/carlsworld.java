package carlshorse;

public class carlsworld {
	public static void main(String [ ] args) {
		horse x = new horse();
		x.setName("Daly");
		x.setAge(13);
		x.setWeight(150.3);
		if (x.getAgeErr() == false || x.getWeightErr() == false) {
			System.out.println(x.getName());
		}
		if (x.getAgeErr() == false) {
			System.out.print("age: " + x.getAge() + ", ");
		}
		if (x.getWeightErr() == false){
			System.out.println("weight: " + x.getWeight());
		}
		
		System.out.println(" ");
		
		horse y = new horse();
		y.setName("Caaaaarlllllll");
		y.setAge(13);
		y.setWeight(-150.3);
		if (y.getAgeErr() == false || y.getWeightErr() == false) {
			System.out.println(y.getName());
		}
		if (y.getAgeErr() == false) {
			System.out.print("age: " + y.getAge() + ", ");
		}
		if (y.getWeightErr() == false){
			System.out.println("weight: " + y.getWeight());
		}
		
	}
}