//method overriding
package college.dkte.demo5;

class A{
	public void showRecord() {
		System.out.println("A.showRecord");
	}
	public void printRecord() {
		System.out.println("A.printRecord");
	}
}

class B extends A{
	public void printRecord() {
		System.out.println("B.printRecord");
	}
	public void displayRecord() {
		System.out.println("B.displayRecord");
	}
}
public class Demo5 {
	
	public static void main(String[] args) {
		A ref = new B(); //up-casting
		ref.showRecord();
		ref.printRecord();
		//ref.displayRecord(); //error NOT OK
		B b = (B)ref;
		b.displayRecord();
		b.printRecord();
		b.showRecord();
		
	}
	public static void main2(String[] args) {
		B ref = new B();
		ref.printRecord();
		ref.displayRecord();
		ref.showRecord();
		
	}
	public static void main1(String[] args) {
		A ref = new A();
		ref.showRecord(); //OK
		ref.printRecord(); //OK
		//ref.displayRecord(); //NOT OK

	}

}
