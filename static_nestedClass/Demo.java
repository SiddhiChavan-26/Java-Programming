//static nested class
package college;
class Outer{
	static int outerField1 = 10;
	int outerField2 = 20;
	static int field = 30;
	
	static class Inner{
		static int innerField1 = 40;
		int innerField2 = 50;
		static int field = 60;
		
		public void display() {
			System.out.println("outerField1: "+outerField1);
			//System.out.println("outerField2: "+outerField2); not ok 
			System.out.println("field(Outer.field): "+Outer.field);
			System.out.println("field: "+field); //shadowing
			
			System.out.println("innerField1: "+innerField1);
			System.out.println("innerField2: "+innerField2);
			System.out.println("field: "+field);
		}
		
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		Outer.Inner inObj = new Outer.Inner();
		inObj.display();

	}

}
