package college.dkte;
import java.util.Scanner;

public class Demo1 {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Square of number: " + num*num);

	}
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Square of number: " + num*num);
		sc.close();
	}
	
	public static void main3(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Square of number: "+ num*num );
		sc.close();
		System.out.println("Resourse closed");
	}
	
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Square of number: "+ num*num);
			
		}
		finally {
			sc.close();
			System.out.println("Resourse closed");
		}
		
	}
	
	public static void main5(String[] args) {
		//try with resource ---- java7.0
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Square of number: "+ num*num);
		}
		
	}
	
	
	public static void main(String[] args) {
		//custom resource class
		class MyResource implements AutoCloseable {
			
			public MyResource() {
				System.out.println("Resource created");
			}
			
			@Override
			public void close() {
				System.out.println("Resource closed");
			}
		}
		
		try(MyResource myResourse = new MyResource()){
			System.out.println("My Resource.....");
			
		}
		
	}


}
