package college.dkte.demo5;

public class Circle {
	private double radius;
	private final static double PI = 3.14;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius =  radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPi() {
		return PI;
	}
	
	public double calArea() {
		return PI*this.radius*this.radius;
	}
	
	public double calPeri() {
		return 2 * PI * this.radius;
	}
}
