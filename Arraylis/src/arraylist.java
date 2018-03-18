import java.util.ArrayList;
import java.util.List;

public class arraylist {
	public St
	List<Shape> ls = new ArrayList<>();
	ls.add(new Circle(13.0 , 12.0, 38));
	ls.add(new Rect(23,323,323,323));
	
	
	
	

}

abstract class Shape {
	private double x;
	private double y;
	private int r;
	public Shape(double x, double y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
class Circle extends Shape {

	public Circle(double x, double y, int r) {
		super(x, y, r);
		
	}
	
}
class Rect extends Shape {
	private int z;

	public Rect(double x, double y, int r , int z) {
		super(x, y, r);
		this.z = z;
		
	}
	
}
	
	
	
