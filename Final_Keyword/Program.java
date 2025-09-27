//final keyword
package college.dkte.demo5;

public class Program {

	public static void main(String[] args) {
		final Circle c1 = new Circle(3.1);
		System.out.println("The area of circle is: "+ c1.calArea());
		System.out.println("The Perimeter of circle is: "+ c1.calPeri());
		
		Circle c2 = new Circle(2.0);
		System.out.println("Value of PI: "+ c2.getPi());
		System.out.println("Value of radius: "+ c2.getRadius());
		c2.setRadius(3.1);
		System.out.println("Uodated Value of radius: "+ c2.getRadius());
	}

}
