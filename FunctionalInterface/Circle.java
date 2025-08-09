package college.demo1;

public class Circle implements Shape {
	private double radius;
	
	public Circle() {
		//TODO
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return PI*this.radius*this.radius;
	}
}
