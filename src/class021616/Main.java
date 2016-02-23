package class021616;
//Client Code
public class Main {

	public static void main(String[] args) {
		//Default Constructor
		Table t1 = new Table();
		System.out.println(t1);
		
		//Second Constructor
		Table t2 = new Table(25, 37, "Table 2");
		System.out.println(t2);
		
		//Client Error
		Table t3 = new Table(-17, 1.9);
		System.out.println(t3);
		
		//Client Error Correction
		t3.setWidth(23);
		t3.setHeight(5.9);
		t3.setName("Table 3 Corrected");
		System.out.println(t3);
	}
	
}
