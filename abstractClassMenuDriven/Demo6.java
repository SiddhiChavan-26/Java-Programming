package college.dkte;
import java.util.Scanner;

abstract class Shape{
	protected float area;
	
	public abstract void acceptRecord(); //logically 100% incomplete
	public abstract void calculateArea(); //logically 100% incomplete
	
	public final void printRecord() { //logically 100% complete
		System.out.println("Area: "+ this.area);
	}
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {
		//TODO
	}
	
	@Override
	public final void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = sc.nextInt();
		System.out.print("Enter breadth: ");
		breadth = sc.nextInt();
	}
	
	@Override
	public final void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	
	public Circle() {
		//TODO
	}
	
	@Override
	public final void acceptRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius: ");
		radius = sc.nextFloat();
	}
	
	@Override
	public final void calculateArea() {
		this.area = (float)Math.PI * this.radius*this.radius;
	}
}
public class Demo6 {
	public static int menuList() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Shape shape = null;
		int choice;
		while((choice = menuList()) != 0) {
			switch(choice) {
			case 1: 
				shape = new Rectangle();
				break;
				
			case 2:
				shape = new Circle();
				break;
				
			default :
				System.out.println("Invalid choice!");
			}
			
			if(shape != null) {
				shape.acceptRecord();
				shape.calculateArea();
				shape.printRecord();
			}
		}

	}

}
