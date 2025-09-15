package college.dkte.geometry;

public class Program {

	public static void main(String[] args) {
		Shape rect = new Rectangle(10,20);
		System.out.println("Area of rectangle: "+ rect.calculateArea());
		System.out.println("Perimeter of rectangle: "+ rect.calculatePeri());
		
		Shape c1 = new Circle(3.1f);
		System.out.println("Area of Circle: "+ c1.calculatePeri());
		System.out.println("Perimeter of Circle: "+ c1.calculatePeri());
		
		Shape s1 =  new Square(5);
		System.out.println("Area of Square: "+ s1.calculateArea());
		System.out.println("Perimeter of Square: "+ s1.calculatePeri());

	}

}
