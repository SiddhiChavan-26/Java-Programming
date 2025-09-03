package college.dkte;
import java.util.Scanner;

enum Arithmetic1{
	EXIT , ADD , SUB , MUL , DIV  
}

public class Demo4 {
	public static void main(String[] args) {
		int index ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		Arithmetic1[] aritVal = Arithmetic1.values(); 
		for(Arithmetic1 ar : aritVal) {
			System.out.println(ar.ordinal() + "." + ar.name());
		}
		System.out.println("Enter the option : ");
		String option = sc.next(); 
		Arithmetic1 choice = Arithmetic1.valueOf(option); 
		switch (choice) {
		case ADD:
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case SUB:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case MUL:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case DIV:
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		}

	}
}
