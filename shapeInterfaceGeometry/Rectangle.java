package college.dkte.geometry;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {
		//TODO
	}
	public Rectangle(int length, int breadth) {
		this.length =  length;
		this.breadth = breadth;
	}
	
	@Override
	public final double calculateArea() {
		return this.length * this.breadth;
	}
	
	@Override
	public final double calculatePeri() {
		return 2 * (this.length * this.breadth);
	}
	
}
