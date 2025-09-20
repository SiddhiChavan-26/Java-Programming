// instance of operator
package college.dkte.demo7;
import java.util.Scanner;

class Shape{
	protected float area;
	
	public void calculateArea() {
		//TODO
	}
	public float getArea() {
		return area;
	}
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {
		//TODO
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth =  breadth;
	}
	
	@Override
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	private float radius;
	public Circle() {
		//TODO
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		this.area = (float) (Math.PI * this.radius * this.radius);
	}
}
public class Demo7 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void acceptRecord(Shape shape) {
		if(shape instanceof Rectangle) {
			Rectangle rect = (Rectangle)shape;
			System.out.print("Length: ");
			rect.setLength(sc.nextInt());
			System.out.print("Breadth: ");
			rect.setBreadth(sc.nextInt());
		}else if(shape instanceof Circle){
			Circle c = (Circle)shape;
			System.out.print("Radius: ");
			c.setRadius(sc.nextFloat());
		}else {
			System.out.println("Invalid shape!");
		}
	}
	public static void printRecord(Shape shape) {
		System.out.println("The area is: "+ shape.getArea());
	}
	
	
	public static void main(String[] args) {
		int choice;
		while((choice = menuList()) != 0) {
			Shape shape = null;
			switch(choice) {
			case 1: 
				shape = new Rectangle(); // up-casting
				break;
				
			case 2:
				shape = new Circle(); //up-casting
				break;
				
			default:
				System.out.println("Invalid choice!");
				break;
			}
			if(shape != null) {
				Demo7.acceptRecord(shape);
				shape.calculateArea();
				Demo7.printRecord(shape);
				
				
			}
		}

	}

}
