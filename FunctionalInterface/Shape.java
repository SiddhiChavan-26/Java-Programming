package college.demo1;

@FunctionalInterface
public interface Shape {
	/* public static final*/ double PI = 3.14;
	/*public abstract*/ double calcArea();
	public static double calculateTotalArea(Shape[] arr) {
		double total = 0.0;
		for( int i =0; i< arr.length; i++) {
			total = total + arr[i].calcArea();
			
		}
		return total;
	}
	
	//default methods
	default double calPeri() {
		return 0.0;
	}
	
}
