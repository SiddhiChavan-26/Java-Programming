package college.dkte.geometry;

public class Square implements Shape{
	private int side;
	
	public Square() {
		//TODO
	}
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public final double calculateArea() {
		return this.side * this.side;
	}
	
	@Override
	public final double calculatePeri() {
		return 4 * this.side;
	}
}
