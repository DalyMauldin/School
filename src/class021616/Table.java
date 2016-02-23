package class021616;
//Class Definition
public class Table {

	String name;
	//name set and get \/
	public void setName(String x){
		name = x;
	}
	
	public String getName(){
		return name;
	}
	//name set and get /\
	
	private int width;
	//width set and get \/
	public void setWidth(int x){
		if(x >= 3){
			width = x;
		} else {
			width = 3;
		}
	}
	
	public int getWidth(){
		return width;
	}
	//width set and get /\
	
	private double height;
	//height set and get \/
	public void setHeight(double x){
		if(x >= 2.0){
			height = x;
		} else {
			height = 2.0;
		}
	}
	
	public double getHeight(){
		return height;
	}
	//height set and get /\
	
	//constructors \/
	public Table(){
		width = 10;
		height = 6;
		name = "Table";
	}
	
	public Table(int w, double h){
		setWidth(w);
		setHeight(h);
		setName("Table");
	}
	
	public Table(int w, double h, String s){
		setWidth(w);
		setHeight(h);
		setName(s);
	}
	//constructors /\
	
	//toString \/
	public String toString(){
		return name + ": Height: " + height + ", Width: " + width;
	}
	//toString /\
}
