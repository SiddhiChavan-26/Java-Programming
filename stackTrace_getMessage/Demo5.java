package college.dkte;
import java.util.Scanner;

public class Demo5 {
	public static int divide(int num, int den) {
		int res = num/den; //may throw ArithmeticException
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter numerator: ");
			int num = sc.nextInt();
			System.out.print("Enter denominator: ");
			int den = sc.nextInt();
			int result = divide(num , den);
			System.out.println("Result: "+ result);
		}catch(Throwable e){
			//e.printStackTrace();
			System.out.println("Message: "+ e.getMessage());
		}
	}

}
