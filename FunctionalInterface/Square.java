package college.demo1;

public class Square implements Shape{
	private int side;
	
	public Square() {
		//TODO
	}
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public double calcArea() {
		return this.side * this.side;
	}
}
