package college.dkte.geometry;

public class Circle implements Shape {
	private double radius;
	public Circle() {
		//TODO
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return PI*this.radius*this.radius;
	}
	@Override
	public double calculatePeri() {
		return 2 * PI * this.radius;
	}
}
