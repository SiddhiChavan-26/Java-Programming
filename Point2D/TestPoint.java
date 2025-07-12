package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinates of point 1: ");
		double x1 = sc.nextDouble();
		double y1 =  sc.nextDouble();
		
		System.out.println("Enter co-ordinates of point 2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		
		System.out.println("Point 1 details: "+ p1.getDetails());
		System.out.println("Point 2 details: "+ p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Point 1 and point 2 both are same");
		}else {
			System.out.println("Point 1 and Point 2 both afre different");
			System.out.println("Distance between point  1 and Point 2 is: "+ p1.calculateDistance(p2));
		}

	}

}
