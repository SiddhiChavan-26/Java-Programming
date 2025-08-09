package college.demo1;

public class Program {

	public static void main(String[] args) {
		Shape[] arr = {
				new Rectangle(10, 20),
				new Circle(5.0),
				new Square(5)
				
		};
		
		//double totalArea = Shapes.calculateTotalarea(arr);
		double totalArea = Shape.calculateTotalArea(arr);
		System.out.println("Total area: "+ totalArea);
		
		for(int i=0; i< arr.length; i++) {
			System.out.println("Perimeter: "+arr[i].calPeri());
		}
		
	}

}
