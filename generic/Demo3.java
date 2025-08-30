//generic method (Type checking at compile time)
package college.dkte;

public class Demo3 {
	public static <T> void swap(T a, T b) {
		T temp = a;
		a = b;
		b = temp;
		System.out.println("A: "+ a);
		System.out.println("B: "+ b);

	}
	public static void main(String[] args) {
		swap(10,20);
		
		swap(20.1, 30.1);
		swap("Siddhi", "Riddhi");
		
		swap(10, 11.33);
//		
		//Program.<Integer>swap(10, 33.11); gives error because we explicitly passed Integer 
	}

}
