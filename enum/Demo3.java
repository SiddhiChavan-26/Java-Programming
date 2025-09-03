package college.dkte;
import java.util.Scanner;

enum Arithmetic{
	EXIT, ADDITION, SUBTRACT, MULTIPLICATION, DIVISION, MODULUS
}
public class Demo3 {

	public static void main(String[] args) {
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		
		Arithmetic[] arVal = Arithmetic.values();
		for(Arithmetic ar : arVal) {
			System.out.println(ar.ordinal() + "." + ar.name());
		}
		System.out.print("Enter your choice: ");
		index = sc.nextInt();
		Arithmetic choice = arVal[index]; 
		switch(choice) {
		case ADDITION:
			result = num1 + num2;
			System.out.println("Addition: "+ result);
			break;
			
		case SUBTRACT:
			result = num1 - num2;
			System.out.println("Subtraction: "+ result);
			break;
			
		case MULTIPLICATION:
			result = num1*num2;
			System.out.println("Multiplication: "+ result);
			break;
			
		case DIVISION:
			result = num1/num2;
			System.out.println("Division: "+ result);
			break;
			
//		case MODULUS:
//			result = num1%num2;
//			System.out.println("Modulus: "+ result);
//			break;
		}

	}

}
