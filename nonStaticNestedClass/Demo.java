//non static nested class
package college;
class Outer1{
	static int outerField1 = 10;
	int outerField2 = 20;
	static int field = 30;
	
	class Inner{
		final static int innerField1 = 40;
		int innerField2 = 50;
		final static int field = 60;
		
		public void display() {
			System.out.println("outerField1: "+outerField1);
			System.out.println("outerField2: "+outerField2);  
			System.out.println("field(Outer.field): "+Outer.field);
			System.out.println("field: "+field); //shadowing
			
			System.out.println("innerField1: "+innerField1);
			System.out.println("innerField2: "+innerField2);
			System.out.println("field: "+field);
		}
		
	}
	
}
public class Demo8 {

	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Outer1.Inner inner = outer.new Inner();
		inner.display();

	}

}
